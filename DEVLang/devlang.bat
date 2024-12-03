@echo off
REM Get the directory of the script
for %%I in ("%~dp0.") do set "script_dir=%%~fI"

REM Check if exactly one argument is provided
if "%~1"=="" (
    echo Usage: %0 ^<path^>
    exit 1
)

REM Get the absolute path of the input file
for %%I in ("%~1") do set "abs_input_file_path=%%~fI"
echo %abs_input_file_path%

rem Run the Java command and capture the output
for /f "delims=" %%a in ('java -cp "%script_dir%\src\Lexer\classes\antlr-runtime-4.13.1.jar;%script_dir%\src\Lexer\classes" Main "%abs_input_file_path%"') do (
    set java_output=%%a
) 
echo %java_output%

REM Parser
for /f "delims=" %%a in ('swipl -s "%script_dir%\src\parser\Parser.pl" -g "procedure(T, %java_output%, R), write(T), halt."') do (
    set parsed_tree=%%a
)

echo Parser Output: %parsed_tree%


@echo off
