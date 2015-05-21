<%-- 
    Document   : envio
    Created on : 18/10/2014, 08:50:08 PM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<form id="formulario" name="formContacto" method="post" action="process.php" >
	<label for="name">Nombre*:</label>
	<input type="text" name="name" id="name" placeholder="Introduce tu hombre" class="required" /><br />
 
	<label for="surname">Apellidos*:</label>
	<input type="text" name="surname" id="surname" placeholder="Tus dos apellidos" class="required" /><br />
 
	<label for="company">Empresa*:</label>
	<input type="text" name="company" id="company" placeholder="¿Para quién trabajas?" class="required" /><br />
 
	<label for="department">Cargo/Departamento:</label>
	<input type="text" name="department" id="department" placeholder="¿Qué función desempeñas?" /><br />
 
	<label for="phone">Teléfono:</label>
	<input type="tel" name="phone" id="phone" placeholder="¿Hablamos?" /><br />
 
	<label for="mail">E-mail*:</label>
	<input type="email" name="mail" id="mail" placeholder="Podré contestarte" class="required" /><br />
 
	<label for="comment">Comentario:</label>
	<textarea placeholder="Escribeme tu comentario aquí" id="comment" name="comment"></textarea><br />
 
	<div id="aster" > * | Campos obligatorios</div>
 
	<input class="botonAcceder" type="submit" id="boton" value="Enviar" />
        
$nombre = strip_tags($_POST['name']);
$apellidos = strip_tags($_POST['surname']);
$empresa = strip_tags($_POST['company']);
$departamento = strip_tags($_POST['department']);
$telefono = strip_tags($_POST['phone']);
$correo = strip_tags($_POST['mail']);
$comentario = strip_tags($_POST['comment']);

$fecha = time();
$fechaFormateada = date("j/n/Y", $fecha);

$textoEmisor = "MIME-VERSION: 1.0\r\n";
$textoEmisor .= "Content-type: text/html; charset=UTF-8\r\n";
$textoEmisor .= "From: Formulario creado por DarioBF - www.dariobf.com";

$correoDestino = "ebanisteriachalo@gmail.com";

$asunto = "Contacto WEB_$nombre $apellidos; de $empresa";
 
//Formateo el cuerpo del correo
$cuerpo = "<b>Enviado por:</b> " . $nombre . ", " . $apellidos . " a las " . $fechaFormateada . "<br />";
$cuerpo .= "<b>Empresa:</b> " . $empresa . ", <b>en el cargo/departamento de</b> " . $departamento . "<br />";
$cuerpo .= "<b>Teléfono de contacto: </b>" . $telefono . "<br />";
$cuerpo .= "<b>E-mail:</b> " . $correo . "<br />";
$cuerpo .= "<b>Comentario:</b> " . $comentario;
</form>


