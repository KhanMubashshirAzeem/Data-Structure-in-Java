    package funtions.inline

    class NoinlineFunctions {
    }

    fun guideTour() {
        print("guide start")
        teach({
            print("teach abc")
        }, {
            print("teach xyz")
        })
        print("guide end")
    }
    inline fun teach(abc: () -> Unit, xyz: () -> Unit) {
        abc()
        xyz()
    }

    /*
    Let's go to the decompiled code. The decompiled code is as below:


    public void guide() {
        System.out.print("guide start");
        System.out.print("teach abc");
        System.out.print("teach xyz");
        System.out.print("guide end");
    }
     */


    /*
    Here, both the lambdas(abc, xyz) passed to an inline function got inlined.

    What if we want only the first lambda(abc) to get inlined but not the second lambda(xyz)?

    In that case, we will have to use the noinline modifier with that lambda(xyz).

     */

    fun guideTour1() {
        print("guide start")
        teach1({
            print("teach abc")
        }, {
            print("teach xyz")
        })
        print("guide end")
    }

    inline fun teach1(abc: () -> Unit, noinline xyz: () -> Unit) {
        abc()
        xyz()
    }

    /*
    Again, let's go to the decompiled code. The decompiled code is as below:

    public void guide() {
        System.out.print("guide start");
        System.out.print("teach abc");
        teach(new Function() {
            @Override
            public void invoke() {
                System.out.print("teach xyz");
            }
        });
        System.out.print("guide end");
    }

    public void teach(Function xyz) {
        xyz.invoke();
    }

    Here, we can see that the lambda(xyz) has not got inlined as expected.
    Only the lambda(abc) got inlined.
    This is how noinline in Kotlin helped us in achieving what we wanted.

    This way, we used the noinline to avoid the inlining.
     */

