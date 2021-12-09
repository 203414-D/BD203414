import {makeStyles} from '@material-ui/core/styles';
import {useEffect, useState} from "react";
import {Table, TableContainer, TableHead, TableCell, TableBody, TableRow, Modal, Button, TextField} from '@material-ui/core';
import {Edit, Delete} from '@material-ui/icons';


//Direccion para hacer el get, listado de dueños
const urlApi_get = "http://localhost:8088/listaDueno";
//Direccion para post, agregar dueño
const urlApi_post = "http://localhost:8088/dueno/new/";

//Variable temporar para capturar el id del dueño para actualizar
let IdDueno = 0;

//Construllo el stilos de los modales
const useStyles = makeStyles((theme) => ({
    modal:{
        position: 'absolute',
        width: 400,
        backgroundColor: theme.palette.background.paper,
        border: '2px solid #000',
        boxShadow: theme.shadows[5],
        padding: theme.spacing(2, 4, 3),
        top: '50%',
        left: '50%',
        transform: 'translate(-50%, -50%)'
    },
    iconos:{
        cursor: 'pointer'
    },
    inputMaterial:{
        width: '100%'
    }
    
}));

const Dueno= () => {
    const  [data , setData] = useState([]);
    //hook para Dueños
    const styles= useStyles();
    //hook modal insertar dueños
    const [modalInsertar, setModalInsertar]=useState(false);
    const [modalActualizar, setModalActualizar]=useState(false);
    

    const [consolaSeleccionada, setConsolaSeleccionada]=useState({
        nombreduenos: '',
        telefono:'',
        direccion: ''
    })

    const handleChange=e=>{
        const {name, value}=e.target;
        setConsolaSeleccionada(prevState=>({
            ...prevState,
            [name]: value
        }))
        //console.log(consolaSeleccionada);
    }

    const peticionPost = async () =>{ //Comienza la funion POST.

        const requestOptions = {
            'method': 'POST', //Metodo Post
            'headers': { //Cavezal de lo que se esta enviando a la api
                'Accept' : 'application/json',
                'Content-Type': 'application/json',
                'Authorization': 'Bearer my-token',
                'My-Custom-Header': 'foobar',
                'Access-Control-Allow-Origin': '*',
                'Access-Control-Allow-Methods' : 'GET, POST, PATCH, PUT, DELETE, OPTIONS',
                'Access-Control-Allow-Headers' : 'Origin, Content-Type, X-Auth-Token'
            },
            'mode': 'cors', //Modo de envio
            'body': JSON.stringify(consolaSeleccionada) //Cuerpo del envio
        };

        //Mando los datos y me los devuele con Id
        fetch(urlApi_post, requestOptions)
            .then(response => response.json())
            .then(json => {
                //console.log(json);
                //Agrego el nuevo registro
                setData(data.concat(json));
                abrirCerrarModalInsertar()

            });

    }

    const peticionDelete = async (iddueno) =>{
        console.log("incia el delete para el: ", iddueno )
        console.log('http://localhost:8088/dueno/delete/'+iddueno)

        const requestOptions = {
            'method': 'DELETE',
            'headers': {
                'Accept' : 'application/json',
                'Content-Type': 'application/json',
                'Authorization': 'Bearer my-token',
                'My-Custom-Header': 'foobar',
                'Access-Control-Allow-Origin': '*',
                'Access-Control-Allow-Methods' : 'GET, POST, PATCH, PUT, DELETE, OPTIONS',
                'Access-Control-Allow-Headers' : 'Origin, Content-Type, X-Auth-Token'
            },
            'mode': 'cors',
            'body': '{}'
        };

        await fetch("http://localhost:8088/dueno/delete/" +iddueno ,requestOptions)
            .then(response => response.json()) 
            .then(json => {
                //console.log(json);
                //setData(json)
                console.log("Eliminado el ",iddueno);
                
                fetchData();
                
            })
            .catch(error => console.log(error))
        


    }

    const peticionUpdate = async () =>{
        console.log("incia el update para el: ", IdDueno )
        console.log('Actualizando el '+IdDueno)

        const requestOptions = {
            'method': 'POST',
            'headers': {
                'Accept' : 'application/json',
                'Content-Type': 'application/json',
                'Authorization': 'Bearer my-token',
                'My-Custom-Header': 'foobar',
                'Access-Control-Allow-Origin': '*',
                'Access-Control-Allow-Methods' : 'GET, POST, PATCH, PUT, DELETE, OPTIONS',
                'Access-Control-Allow-Headers' : 'Origin, Content-Type, X-Auth-Token'
            },
            'mode': 'cors',
            'body': JSON.stringify( {
                idduenos : IdDueno,
                nombreduenos: consolaSeleccionada.nombreduenos,
                telefono: consolaSeleccionada.telefono,
                direccion: consolaSeleccionada.direccion
            })
        };

        await fetch("http://localhost:8088/dueno/new/" ,requestOptions)
            .then(response => response.json()) 
            .then(json => {
                //console.log(json);
                //setData(json)
                console.log("Eliminado el ",IdDueno);
                
                fetchData();
                abrirCerrarModalActualizar();
                IdDueno = 0;
                
            })
            .catch(error => console.log(error))
        
    }

    //Construllo la peticion get con el fetch
    const fetchData = async () => {
        await fetch(urlApi_get)
            .then(response => response.json())
            .then(json => {
                //console.log(json);
                setData(json)
            })
            .catch(error => console.log(error))
    }


    useEffect(() => {
        //Mando a llamar la peticion get
        fetchData();
    },[]);


   

    const abrirCerrarModalInsertar=()=>{
        setModalInsertar(!modalInsertar);
    }

    const abrirCerrarModalActualizar=()=>{
        setModalActualizar(!modalActualizar);
    }


    const bodyInsertar=(
        <div className={styles.modal}>
            <h3>Agregar Nueva Dueno</h3>
            <TextField name="nombreduenos"    className={styles.inputMaterial} label="Nombre" onChange={handleChange} label="Nombre" />
            <br />
            <TextField name="telefono"  className={styles.inputMaterial} label="Telefono" onChange={handleChange} />
            <br />
            <TextField name="direccion" className={styles.inputMaterial} label="Direccion" onChange={handleChange} />
            <br />

            <br /><br />
            <div align="right">
                <Button color="primary" onClick={()=>peticionPost()}>Agregar</Button>
                <Button onClick={()=>abrirCerrarModalInsertar()} >Cancelar</Button>
            </div>
        </div>
    )

    const capturarDatos = (IdDuenoTemp, nombreduenos ,telefono, direccion) =>{
        console.log("Datos duenño: ",IdDueno, nombreduenos ,telefono, direccion)
        setConsolaSeleccionada({ nombreduenos:nombreduenos ,telefono:telefono, direccion:direccion })
        IdDueno = IdDuenoTemp
        abrirCerrarModalActualizar();
    

    }

    const bodyActualizar=(
        <div className={styles.modal}>
            <h3>Datos del dueño</h3>
            <TextField name="nombreduenos"    className={styles.inputMaterial} label="Nombre" onChange={handleChange} value={consolaSeleccionada.nombreduenos}/>
            <br />
            <TextField name="telefono"  className={styles.inputMaterial} label="Telefono" onChange={handleChange} value={consolaSeleccionada.telefono} />
            <br />
            <TextField name="direccion" className={styles.inputMaterial} label="Direccion" onChange={handleChange} value={consolaSeleccionada.direccion} />
            <br />

            <br /><br />
            <div align="right">
                <Button color="primary" onClick={()=> peticionUpdate()} >Actualizar</Button>
                <Button onClick={()=>abrirCerrarModalActualizar()} >Cancelar</Button>
            </div>
        </div>
    )



    return (
            <div>
                <br/>
                <h2>Lista de Dueños</h2>
                <br/>

                <Button onClick={()=>abrirCerrarModalInsertar()}>Agregar Dueño</Button>

                <br/>
                <br/>
                <TableContainer>
                    <Table>
                        <TableHead>
                            <TableRow>
                                <TableCell>Id</TableCell>
                                <TableCell>Nombre</TableCell>
                                <TableCell>Telefono</TableCell>
                                <TableCell>Direccion</TableCell>
                                <TableCell>Acciones</TableCell>
                            </TableRow>
                        </TableHead>
                        <TableBody>
                            {data.map(dueno =>(
                                <TableRow key={dueno.idduenos}>
                                    <TableCell>{dueno.idduenos}</TableCell>
                                    <TableCell>{dueno.nombreduenos}</TableCell>
                                    <TableCell>{dueno.telefono}</TableCell> 
                                    <TableCell>{dueno.direccion}</TableCell>
                                    <TableCell>
                                        <Edit onClick={()=>capturarDatos(dueno.idduenos,dueno.nombreduenos,dueno.telefono,dueno.direccion)} className={styles.iconos}/>
                                        &nbsp;&nbsp;&nbsp;
                                        <Delete onClick={()=>peticionDelete(dueno.idduenos)} className={styles.iconos}/>
                                    </TableCell>
                                </TableRow>

                            ))}
                        </TableBody>
                    </Table>
                </TableContainer>

                <Modal
                    open = {modalInsertar}
                    onClose = {abrirCerrarModalInsertar}
                >
                    {bodyInsertar}
                </Modal>
                <Modal
                    open = {modalActualizar}
                    onClose = {abrirCerrarModalActualizar}
                >
                    {bodyActualizar}
                </Modal>                

                <br/>
            </div>
    )
}
export default Dueno