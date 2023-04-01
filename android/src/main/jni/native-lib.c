#include <jni.h>

JNIEXPORT jstring JNICALL
Java_expo_modules_settings_ExpoSettingsModule_stringFromJNI(JNIEnv* env, jobject /* this */) {
    return (*env)->NewStringUTF(env, "Hello from C!");
}