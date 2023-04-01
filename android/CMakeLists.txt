cmake_minimum_required(VERSION 3.10.2)

add_library(native-lib SHARED src/main/jni/native-lib.c)

find_library(log-lib log)

target_link_libraries(native-lib ${log-lib})
