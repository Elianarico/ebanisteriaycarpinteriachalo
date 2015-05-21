connect system/root;
create user prueba identified by 123;
grant connect, resource to prueba;
connect prueba/123;
drop  table  tblusuario;
CREATE TABLE tblusuario (
    identidad varchar(15) NOT NULL PRIMARY KEY,
    documento varchar(2) NOT NULL,
    nombre varchar(20) NOT NULL,
    apellidos varchar(25) NOT NULL,
    email varchar (40) NOT NULL,
    celular varchar (15) NOT NULL,
    direccion varchar (35) NOT NULL,
    clave varchar(5) NOT NULL, 
    telefono varchar(15) NOT NULL,
    estado varchar(15) NOT NULL, 
    perfil varchar(20) NOT NULL,
    genero varchar(11) NOT NULL ) ;


    INSERT INTO tblusuario (nombre,documento,apellidos,identidad,email,celular,direccion,clave,telefono, estado, perfil, genero) VALUES 
        ('97090614170', 'TI', 'Karen Juliana', 'Maldonado Palacio', 'karen.maldonado925@gmail.com', '3216118351', 'Cra 48# 59-29', '123', '2543528', 'Inactivo', 'Administrador', 'Femenino');

         
   INSERT INTO tblusuario (nombre,documento,apellidos,identidad,email,celular,direccion,clave,telefono, estado, perfil, genero) VALUES 
        ('97062604410', 'TI', 'Juliana', 'Moreno Yepes', 'julianamoenoyepes@gmail.com', '3006071694',  'Cra 76A# 26-01', '1234', '3473497', 'Activo', 'Administrador', 'Masculino');


   INSERT INTO tblusuario (nombre,documento,apellidos,identidad,email,celular,direccion,clave,telefono, estado, perfil, genero) VALUES 
        ('98052460190', 'TI', 'Eliana María', 'Medina Rico', 'elianammedina31@gmail.com', '3165569332',  'Cra 10# 54-41', '1235', '2260782', 'Activo', 'Administrador', 'Femenino');
select * from tab;
select * from tblusuario;
