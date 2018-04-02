@ECHO OFF

REM ***********************************************
REM the directory path to java.exe on your machine may be different
REM from the path I have between the double quotes below to this may
REM need to be changed in order for compile to work on your machine
REM IF JAVA_HOME is set you do not need to specify the path just java
REM ***********************************************

START "C:\Program Files\Java\jdk1.8.0_162\bin\java.exe" java -cp target/Gitstarted-v1.jar com.smileyowley.Gitstarted.App
START "C:\Program Files\Java\jdk1.8.0_162\bin\java.exe" java -cp target/Gitstarted-v1.jar com.smileyowley.Gitstarted.App -v
START "C:\Program Files\Java\jdk1.8.0_162\bin\java.exe" java -cp target/Gitstarted-v1.jar com.smileyowley.Gitstarted.App -help
START "C:\Program Files\Java\jdk1.8.0_162\bin\java.exe" java -cp target/Gitstarted-v1.jar com.smileyowley.Gitstarted.App -version

echo "Press ENTER to close window..."
PAUSE