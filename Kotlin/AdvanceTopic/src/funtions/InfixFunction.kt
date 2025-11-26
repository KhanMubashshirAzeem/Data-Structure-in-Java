//package funtions
//
///*
//infix functions are a special type of function that allows you to call the function in a more natural,
//readable way, similar to an operator. Infix functions are called using infix notation,
//which means you can call them without using the usual dot (.) notation or parentheses.
// */
//
//// an infix function defined on Context that checks if a specific permission is granted.
//infix fun Context.hasPermission(permission: String): Boolean {
//    return ContextCompat.checkSelfPermission(this, permission) == PackageManager.PERMISSION_GRANTED
//}
//
//fun main(context: Context) {
//// Instead of calling context.hasPermission(android.Manifest.permission.CAMERA), we use // the infix notation context hasPermission android.Manifest.permission.CAMERA, making
//// the code more readable.
//    if (context hasPermission android.Manifest.permission.CAMERA) {
//        println("Camera permission granted")
//    } else {
//        println("Camera permission not granted")
//    }
//}