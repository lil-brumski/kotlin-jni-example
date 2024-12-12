package sam

class NativeSample {
    init {
        System.loadLibrary("kotlin-jni-example")
    }
    external fun sayHello();

    external fun sendANum(arg: Int);

    external fun sendAString(arg: String);

    external fun getANum(): Int;

    external fun getAString(): String;
}
