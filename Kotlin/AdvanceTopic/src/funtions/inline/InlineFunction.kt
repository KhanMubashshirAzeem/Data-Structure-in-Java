    package funtions.inline

    class InlineFunction{

    }

    private fun guide() {
        print("guide start")
        teach()
        print("guide end")
    }

    private fun teach() {
        print("teach")
    }

    /*
    In this example, we have two functions:

    guide()
    teach()
    Both are normal functions. guide() function calls the teach() function.

    Let's see the decompiled code in order to understand it.
     */


    /* Decompiled code into Java

    public void guide() {
        System.out.print("guide start");
        teach();
        System.out.print("guide end");
    }

    public void teach() {
        System.out.print("teach");
    }

    Here, we can see that the guide() function calls the teach() function as usual.

     */

    /*
    Now let's add the inline keyword to the teach() function.
    Then again decompile the code into the Java

    public void guide() {
       System.out.print("guide start");
       System.out.print("teach");
       System.out.print("guide end");
    }

                                Now, we can see that the code of teach() function is copied inside the guide() function.
                                And the guide() function is no more calling the teach() function.

    This is because we have used the inline keyword.
     */


    /*

    Advantage of inline function: Function call overhead doesn't occur. Less overhead and faster program execution.

    So, when to make the function inline and when not:

    When the function code is very small, it's a good idea to make the function inline.
    When the function code is large and called from so many places, it's a bad idea to make the function inline, as the large code will be repeated again and again.

     */

