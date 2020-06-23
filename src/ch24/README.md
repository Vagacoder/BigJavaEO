## How to run Apache Derby Database

1. download Derby install package .zip file from its website and unzip it to a folder, such as `~/db-derby-10.15.2.0-bin`.

2. edit .bashrc at home folder, add 2 extra lines:

    `$ export DERBY_HOME=~/db-derby-10.15.2.0-bin`
    `$export PATH="$DERBY_HOME/bin:$PATH"`

3. copy `~/db-derby-10.15.2.0-bin/lib/derby.jar` to this folder.

4. copy source files to this folder and rename package name (I already did it).

5. compile `TestDB.java` at `src/` folder (don't run at `BigJavaEO` folder, since all packages are based on `src/`):

    `BigJavaEO/src $ javac ch24/TestDB.java`

6. run program at `src/` folder:

    `BigJavaEO/src $ java -cp ch24/derby.jar:$DERBY_HOME/lib/derby.jar:$DERBY_HOME/lib/derbyshared.jar:. ch24.TestDB ch24/database.properties`

7. you should see output of `Romeo`
