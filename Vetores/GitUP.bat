@echo off

git init
git add *
git commit -m "%date%"
cls
color e

cls
echo Exemplo: https://github.com/Vitor-Carmo/testando.git
echo.
echo.
set /p vai=Digite seu repositorio: 
git remote add origin %vai%
git push -u origin master

color d
echo.
echo.
echo.
echo.
echo Aperte qualquer tecla para sair...
pause>nul
















