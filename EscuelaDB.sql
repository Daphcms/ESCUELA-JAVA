CREATE DATABASE EscuelaDB;
USE EscuelaDB;

CREATE TABLE Carrera (
  CarreraId INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
  Nombre VARCHAR(50),
  Clave VARCHAR(10),
  Active BOOLEAN DEFAULT TRUE
  );

 
CREATE TABLE Profesor (
  ProfesorId INTEGER PRIMARY KEY AUTO_INCREMENT,
  Nombre VARCHAR(50),
  APaterno VARCHAR(50),
  AMaterno VARCHAR(50),
  RFC VARCHAR(13),
  Active BOOLEAN DEFAULT TRUE,
  CarreraId INTEGER,
  FOREIGN KEY (CarreraId) REFERENCES Carrera(CarreraId)
);

  
CREATE TABLE Materia (
MateriaId INTEGER NOT NULL AUTO_INCREMENT,
Nombre VARCHAR(50),
Active BOOLEAN DEFAULT TRUE,
Clave VARCHAR(12),
CarreraId INTEGER,
PRIMARY KEY (MateriaId),
FOREIGN KEY (CarreraId) REFERENCES Carrera(CarreraId)
);

CREATE TABLE Periodo (
    PeriodoId INTEGER PRIMARY KEY AUTO_INCREMENT,
    NombrePeriodo VARCHAR(50) NOT NULL
);

CREATE TABLE Clase (
  ClaseId INTEGER PRIMARY KEY AUTO_INCREMENT,
  Nombre VARCHAR(25),
  Horario VARCHAR(50),
  MateriaId INTEGER,
  Active BOOLEAN DEFAULT TRUE,
  ProfesorId INTEGER,
  FOREIGN KEY (MateriaId) REFERENCES Materia(MateriaId),
  FOREIGN KEY (ProfesorId) REFERENCES Profesor(ProfesorId)
);

CREATE TABLE Estudiante (
  EstudianteId INTEGER PRIMARY KEY AUTO_INCREMENT,
  Nombre VARCHAR(25),
  APaterno VARCHAR(25),
  AMaterno VARCHAR(25),
  Aniolngreso INTEGER,
  PeriodoId INTEGER,
  Celular VARCHAR(10),
  Email VARCHAR(50),
  FechaNacimiento DATE,
  CarreraId INTEGER,
FOREIGN KEY(PeriodoId) REFERENCES Periodo(PeriodoId),
 FOREIGN KEY (CarreraId) REFERENCES Carrera(CarreraId),
);

--parte 2. INSERTAR REGISTROS

-- TABLA CARRERA
INSERT INTO Carrera (Nombre, Clave) VALUES
('Ingeniería en Sistemas', 'IS01'),
('Ingeniería Industrial', 'II02'),
('Contaduría Pública', 'CP03'),
('Administración de Empresas', 'AE04'),
('Derecho', 'DR05'),
('Arquitectura', 'AR06'),
('Diseño Gráfico', 'DG07'),
('Medicina', 'MD08'),
('Enfermería', 'EN09'),
('Psicología', 'PS10');

-- TABLA PROFESOR
INSERT INTO Profesor (Nombre, APaterno, AMaterno, RFC, CarreraId) VALUES
('Juan', 'Pérez', 'López', 'JUAP800101ABC', 1),
('María', 'García', 'Hernández', 'MARG820215XYZ', 2),
('Carlos', 'Ramírez', 'Torres', 'CARR750301JKL', 3),
('Laura', 'Martínez', 'Díaz', 'LAUM860720MNO', 4),
('Pedro', 'Sánchez', 'Ruiz', 'PEDS700102PQR', 5),
('Ana', 'Flores', 'Cruz', 'ANAF900830STU', 6),
('Jorge', 'Castillo', 'Morales', 'JORC650305VWX', 7),
('Lucía', 'Jiménez', 'Ponce', 'LUCI950121YZA', 8),
('Ricardo', 'Hernández', 'Vega', 'RICH880412BCD', 9),
('Sofía', 'Ortega', 'Navarro', 'SOFO930914EFG', 10);

-- TABLA MATERIA
INSERT INTO Materia (Nombre, Clave, CarreraId) VALUES
('Programación I', 'MAT001', 1),
('Bases de Datos', 'MAT002', 1),
('Contabilidad General', 'MAT003', 3),
('Derecho Civil I', 'MAT004', 5),
('Dibujo Arquitectónico', 'MAT005', 6),
('Análisis Clínico', 'MAT006', 8),
('Psicología Infantil', 'MAT007', 10),
('Administración I', 'MAT008', 4),
('Termodinámica', 'MAT009', 2),
('Diseño Digital', 'MAT010', 7);

-- TABLA PERIODO
INSERT INTO Periodo (NombrePeriodo) VALUES
('Enero - Junio 2024'),
('Agosto - Diciembre 2024'),
('Enero - Junio 2025'),
('Agosto - Diciembre 2025'),
('Enero - Junio 2026'),
('Agosto - Diciembre 2026'),
('Enero - Junio 2027'),
('Agosto - Diciembre 2027'),
('Enero - Junio 2028'),
('Agosto - Diciembre 2028');

-- TABLA CLASE
INSERT INTO Clase (Nombre, Horario, MateriaId, ProfesorId) VALUES
('Clase 1', 'Lunes 8-10 AM', 1, 1),
('Clase 2', 'Martes 10-12 PM', 2, 1),
('Clase 3', 'Miércoles 9-11 AM', 3, 3),
('Clase 4', 'Jueves 1-3 PM', 4, 5),
('Clase 5', 'Viernes 11-1 PM', 5, 6),
('Clase 6', 'Lunes 3-5 PM', 6, 8),
('Clase 7', 'Martes 8-10 AM', 7, 10),
('Clase 8', 'Miércoles 2-4 PM', 8, 4),
('Clase 9', 'Jueves 9-11 AM', 9, 2),
('Clase 10', 'Viernes 1-3 PM', 10, 7);

-- TABLA ESTUDIANTE
INSERT INTO Estudiante (Nombre, APaterno, AMaterno, Aniolngreso, PeriodoId, Celular, Email, FechaNacimiento, CarreraId) VALUES
('Luis', 'Gómez', 'Ramírez', 2024, 1, '2212345670', 'luis.gomez@email.com', '2004-05-15', 1),
('Andrea', 'López', 'Martínez', 2024, 1, '2212345671', 'andrea.lopez@email.com', '2003-09-20', 2),
('Miguel', 'Santos', 'Hernández', 2025, 3, '2212345672', 'miguel.santos@email.com', '2005-01-10', 3),
('Paola', 'Fernández', 'Castro', 2025, 3, '2212345673', 'paola.fernandez@email.com', '2004-07-22', 4),
('José', 'Hernández', 'Ruiz', 2026, 5, '2212345674', 'jose.hernandez@email.com', '2003-03-03', 5),
('Mariana', 'Castillo', 'Vargas', 2026, 5, '2212345675', 'mariana.castillo@email.com', '2004-11-18', 6),
('Fernando', 'Pérez', 'Luna', 2027, 7, '2212345676', 'fernando.perez@email.com', '2002-12-09', 7),
('Diana', 'Ortega', 'Flores', 2027, 7, '2212345677', 'diana.ortega@email.com', '2005-02-28', 8),
('Roberto', 'Jiménez', 'Morales', 2028, 9, '2212345678', 'roberto.jimenez@email.com', '2003-06-12', 9),
('Carla', 'Vega', 'Ponce', 2028, 9, '2212345679', 'carla.vega@email.com', '2004-08-25', 10);
