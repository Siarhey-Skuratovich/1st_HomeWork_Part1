# 1st_HomeWork_Part1
## Steps:
1. Modified *Main.java* and *Bicycle.java* files using external lib *lombok*.
2. External lib *lombok.jar* downloaded  and placed in *"com/mainTask"* directory since *lombok* works with "javac" tool "out of box".
3. .class files were compiled by entering *"javac -cp lombok.jar Bicycle.java Main.java"* in git Bash.
4. Added the *"Class-Path: ./lombok.jar"* attribute to the *Manifest.txt* file.
5. *executableWithExtLib.jar* file was created in ../.. directory by entering *"jar cvfm executableWithExtLib.jar com/mainTask/Manifest.txt com/mainTask/*.class com/mainTask/*.jar"* in git Bash.
6. Program was launched by entering *"java -jar executableWithExtLib.jar" in git Bash.*
