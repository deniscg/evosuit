@echo off

:: Defina o diretório principal do projeto
set PROJECT_DIR=C:\evosuite\projeto

:: Crie a estrutura de diretórios
mkdir "%PROJECT_DIR%\src\main\java\com\example"
mkdir "%PROJECT_DIR%\src\test\java\com\example"

:: Mover o arquivo Calculadora.java para o diretório src/main/java
move "%PROJECT_DIR%\Calculadora.java" "%PROJECT_DIR%\src\main\java\com\example\"

:: Mover o arquivo CalculadoraTest.java para o diretório src/test/java
move "%PROJECT_DIR%\CalculadoraTest.java" "%PROJECT_DIR%\src\test\java\com\example\"

:: Exibir a nova estrutura de diretórios
echo Estrutura de diretórios ajustada!
echo.
echo Diretório principal: %PROJECT_DIR%
echo Arquivo Calculadora.java movido para: src\main\java\com\example
echo Arquivo CalculadoraTest.java movido para: src\test\java\com\example

pause
