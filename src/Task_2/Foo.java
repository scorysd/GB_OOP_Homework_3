package Task_2;
// Builder Pattern
 class Foo {
    private int arg1;
    private String arg2;
    private double arg3;
    private int arg4;
    private String arg5;
    private int arg6;
    private String arg7;

      static class Builder {
        private int arg1;
        private String arg2;
        private double arg3;
        private int arg4;
        private String arg5;
        private int arg6;
        private String arg7;

        public Builder() {
        }

        public Builder arg1(int val) {
            arg1 = val;
            return this;
        }

        public Builder arg2(String val) {
            arg2 = val;
            return this;
        }

        public Builder arg3(double val) {
            arg3 = val;
            return this;
        }

        public Builder arg4(int val) {
            arg4 = val;
            return this;
        }

        public Builder arg5(String val) {
            arg5 = val;
            return this;
        }

        public Builder arg6(int val) {
            arg6 = val;
            return this;
        }

        public Builder arg7(String val) {
            arg7 = val;
            return this;
        }

        public Foo build() {
            return new Foo(this);
        }
    }

    Foo(Builder builder) {
        arg1 = builder.arg1;
        arg2 = builder.arg2;
        arg3 = builder.arg3;
        arg4 = builder.arg4;
        arg5 = builder.arg5;
        arg6 = builder.arg6;
        arg7 = builder.arg7;
    }
}