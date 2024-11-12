<h1>Parcial de Programación II - Sistema Zoológico</h1>

  <p><strong>Materia:</strong> Programación II</p>
  <p><strong>Nivel:</strong> 2º Cuatrimestre</p>
  <p><strong>Tipo de Examen:</strong> Primer Parcial</p>
  <p><strong>Fecha de Examen:</strong> 24 de octubre de 2024</p>
  <p><strong>Docentes a Cargo:</strong> Baus / Quiroz</p>
  <p><strong>División:</strong> 121-2</p>

  <h2>Descripción del Proyecto</h2>
  <p>Este proyecto consiste en la implementación de un sistema básico para la administración de un Zoológico en Java, cumpliendo con principios de Programación Orientada a Objetos (POO). En este zoológico, se gestionará la información de varios tipos de animales, diferenciados en mamíferos, aves y reptiles, y cada uno con atributos y comportamientos específicos.</p>

  <h2>Requisitos del Sistema</h2>
  <ul>
    <li><strong>Agregar Animal</strong>: Permite a los empleados agregar nuevos animales. Lanza una excepción personalizada en caso de que ya exista un animal con el mismo nombre y edad.</li>
    <li><strong>Mostrar Animales</strong>: Muestra todos los animales con sus atributos principales.</li>
    <li><strong>Vacunar Animales</strong>: Vacuna a todos los animales vacunables (mamíferos y aves), informando cuáles no se pueden vacunar (reptiles).</li>
  </ul>

  <h2>Diagrama de Clases</h2>
  <p>Se debe realizar un diagrama de clases que incluya:</p>
  <ul>
    <li>Relaciones de herencia entre la clase base <code>Animal</code> y sus subclases <code>Mamífero</code>, <code>Ave</code> y <code>Reptil</code>.</li>
    <li>Atributos comunes en <code>Animal</code> (nombre, edad) y atributos específicos en cada subclase:
      <ul>
        <li>Mamiferos: peso, tipo de dieta</li>
        <li>Aves: envergadura de alas.</li>
        <li>Reptiles: tipo de escama y regulación de temperatura.</li>
      </ul>
    </li>
    <li>Métodos principales (<code>vacunar</code>, <code>agregarAnimal</code>, etc.) representados adecuadamente.</li>
  </ul>

  <h2>Implementación en Java</h2>

  <h3>Clases y Herencia</h3>
  <p>El código fuente debe incluir:</p>
  <ul>
    <li>Clase base <code>Animal</code> y subclases <code>Mamífero</code>, <code>Ave</code> y <code>Reptil</code>, cada una con sus atributos específicos.</li>
    <li>Métodos que reflejan la funcionalidad solicitada (vacunar, agregarAnimal, etc.).</li>
    <li>Enumerado para definir los tipos de dieta (<code>HERBIVORO</code>, <code>CARNIVORO</code>, <code>OMNIVORO</code>).</li>
  </ul>

  <h3>Excepciones</h3>
  <p>Implementar manejo básico de excepciones, incluyendo:</p>
  <ul>
    <li>Excepción personalizada para evitar duplicación de animales al agregarlos.</li>
  </ul>

  <h3>Métodos Adicionales y Extras</h3>
  <p>Para mejorar la calidad y funcionalidad:</p>
  <ul>
    <li>Métodos adicionales, como <code>toString()</code>, para la representación en texto de cada animal.</li>
    <li>Manejo detallado de la vacunación, indicando con claridad qué animales han sido vacunados y cuáles no.</li>
  </ul>

  <h3>Uso de Colecciones</h3>
  <p>El programa debe utilizar colecciones para almacenar los animales y facilitar la gestión y consulta de la información.</p>

  <h3>Ejecución y Pruebas</h3>
  <p>Es recomendable incluir un menú interactivo o conjunto de pruebas que permita verificar el correcto funcionamiento del sistema, asegurando que cubra todos los casos solicitados en el enunciado.</p>

  <h2>Criterios de Evaluación</h2>
  <p>Para obtener una calificación de 6 a 10 puntos, el sistema debe:</p>
  <ul>
    <li>Contar con un diagrama de clases detallado.</li>
    <li>Implementar correctamente POO (encapsulamiento, uso de <code>enum</code>, modificadores de acceso).</li>
    <li>Manejo avanzado de excepciones y métodos adicionales.</li>
    <li>Utilizar colecciones y demostrar funcionalidad completa.</li>
  </ul>
