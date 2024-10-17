# unit-testing

## Implementación de tests unitarios

Para implementar tests unitarios en este proyecto, sigue estos pasos:

1. **Configura las dependencias de Maven**: Asegúrate de que las dependencias necesarias para las pruebas unitarias estén incluidas en el archivo `pom.xml`.

    ```xml
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>io.projectreactor</groupId>
        <artifactId>reactor-test</artifactId>
        <scope>test</scope>
    </dependency>
    ```

2. **Crea una clase de prueba**: En el directorio `src/test/java`, crea una clase de prueba para la clase que deseas probar. Por ejemplo, para probar `UnitTestingApplication`, crea `UnitTestingApplicationTests.java`:

    ```java
    package org.example.unittesting;

    import org.junit.jupiter.api.Test;
    import org.springframework.boot.test.context.SpringBootTest;

    @SpringBootTest
    class UnitTestingApplicationTests {

        @Test
        void contextLoads() {
        }

    }
    ```

3. **Escribe métodos de prueba**: Añade métodos de prueba en la clase de prueba utilizando las anotaciones de JUnit. Aquí hay un ejemplo de un método de prueba simple:

    ```java
    @Test
    void exampleTest() {
        int expected = 42;
        int actual = 40 + 2;
        assertEquals(expected, actual);
    }
    ```

4. **Ejecuta las pruebas**: Puedes ejecutar las pruebas utilizando tu IDE (IntelliJ IDEA) o desde la línea de comandos con Maven:

    ```sh
    mvn test
    ```

5. **Verifica los resultados**: Revisa los resultados de las pruebas para asegurarte de que todas pasen correctamente.