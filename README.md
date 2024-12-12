#### Kotlin and JNI example

### How to get started ?

Ubuntu/Debian

```bash
   $ apt install clang cmake kotlin git
   $ git clone https://github.com/lil-brumski/kotlin-jni-example.git
   $ cd kotlin-jni-example/
   $ mkdir build && cd build
   $ cmake .. && make
   $ kotlinc ../src/sam/Main.kt ../src/sam/NativeSample.kt -include-runtime -d NativeSample.jar
   $ java -Djava.library.path=. -jar NativeSample.jar
```
