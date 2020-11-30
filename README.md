# ImageEditor
Image Fetch from Gallery - Crop, rotate and simage Exif meta data

For a working implementation, please have a look at the Sample Project - sample

1. UcropLibrary

    a. Include the library as local library project.

    allprojects {
      repositories {
        jcenter()
        maven { url "https://jitpack.io" }
       }
      }

    b. implementation 'com.github.yalantis:ucrop:2.2.2' 

    c. Add UCropActivity into your AndroidManifest.xml

     <activity
        android:name="com.yalantis.ucrop.UCropActivity"
        android:screenOrientation="portrait"
        android:theme="@style/Theme.AppCompat.Light.NoActionBar"/>


2. DEXTER DependencyPermissions
   Dexter is an Android library that simplifies the process of requesting permissions at runtime.
   Android Marshmallow includes a new functionality to let users grant or deny permissions when running an app instead of granting them all when installing it. This approach gives the user more control over applications but requires developers to add lots of code to support it.
   Dexter frees your permission code from your activities and lets you write that logic anywhere you want.

   a. implementation "com.karumi:dexter:5.0.0"

3. Glide
   Glide is a fast and efficient open source media management and image loading framework for Android that wraps media decoding, memory and disk caching, and resource pooling into a simple and easy to use interfa

    a.
     dependencies {
     implementation 'com.github.bumptech.glide:glide:4.11.0'
      annotationProcessor 'com.github.bumptech.glide:compiler:4.11.0'
      }
