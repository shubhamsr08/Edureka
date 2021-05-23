set projectLocation=C:\Users\OK\eclipse-workspace\eclipse pro 1\Frm_Batch4
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml