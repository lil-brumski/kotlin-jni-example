cmake_minimum_required(VERSION 3.10)

project(kotlin-jni-example)

# Set C++ standard
set(CMAKE_CXX_STANDARD 17)

# JNI includes
find_package(JNI REQUIRED)

# Define the shared library
add_library(kotlin-jni-example SHARED jni/sam_NativeSampleImp.cpp)

target_include_directories(kotlin-jni-example PUBLIC jni)

# Link JNI to the shared library
target_link_libraries(kotlin-jni-example  ${JNI_LIBRARIES})
