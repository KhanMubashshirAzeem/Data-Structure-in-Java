    package funtions.inline

    class CrossInlineFunction

    /*

    crossinline is used inside inline functions to prevent non-local returns.

    A non-local return occurs when a return statement inside a lambda tries to exit the outer function, not just the lambda.

     */

    fun guide2() {
        print("guide start")
        teach {
            print("teach")
            return
        }
        print("guide end")
    }

    inline fun teach(abc: () -> Unit) {
        abc()
    }

    /*
    Decompiled code (before using crossinline):

    public void guide() {
        System.out.print("guide start");
        System.out.print("teach");
    }

    Without crossinline, an inline function allows such non-local returns,
    which can cause the remaining code in the outer function to be skipped.

     */



    /*
    Updated code using crossinline:


    By marking a lambda parameter as crossinline, Kotlin prevents using return inside that lambda.

    This ensures the outer function continues execution normally and avoids unexpected flow interruptions.
     */

    fun guide3() {
        print("guide start")
        teach3 {
            print("teach")
            // return is not allowed here
        }
        print("guide end")
    }

    inline fun teach3(crossinline abc: () -> Unit) {
        abc()
    }

    /*
    Decompiled code (after using crossinline):
    public void guide() {
        System.out.print("guide start");
        System.out.print("teach");
        System.out.print("guide end");
    }

    After applying crossinline, the decompiled output shows that the entire function executes as expected.

     */