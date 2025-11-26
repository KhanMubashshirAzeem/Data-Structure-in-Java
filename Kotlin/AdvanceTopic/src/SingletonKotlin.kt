// ApiClient is a singleton object in Kotlin.
// 'object' ensures only ONE instance of ApiClient exists throughout the entire app.
object ApiClient {

    // BASE_URL defines the root endpoint of your API.
    private const val BASE_URL = "https://..."

    // 'retrofit' is created using lazy initialization.
    // Explanation:
    // - 'by lazy' means the Retrofit instance will only be created WHEN it is first accessed.
    // - This reduces memory usage because the object is not created during app startup.
    // - After the first creation, the SAME instance is returned every time (thread-safe by default).

    // Uncomment below part

//    val retrofit: Retrofit by lazy {
//
//        // Create and configure the Retrofit instance.
//        Retrofit.Builder()
//            .baseUrl(BASE_URL) // Sets the base URL for all API calls
//            .addConverterFactory(GsonConverterFactory.create()) // Converts JSON to Kotlin objects
//            .build() // Builds the Retrofit object
//    }
}
