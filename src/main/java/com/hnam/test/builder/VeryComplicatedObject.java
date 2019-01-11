package com.hnam.test.builder;

public class VeryComplicatedObject {
    String a,b,c;
    boolean d,e;
    int f,g;

    VeryComplicatedObject(String a, String b, String c, boolean d, boolean e, int f, int g){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }

    public static class Builder{

        private String a;
        private String b;
        private String c;
        private boolean d;
        private boolean e;
        private int f;
        private int g;

        public Builder setA(String a) {
            this.a = a;
            return this;
        }

        public Builder setB(String b) {
            this.b = b;
            return this;
        }

        public Builder setC(String c) {
            this.c = c;
            return this;
        }

        public Builder setD(boolean d) {
            this.d = d;
            return this;
        }

        public Builder setE(boolean e) {
            this.e = e;
            return this;
        }

        public Builder setF(int f) {
            this.f = f;
            return this;
        }

        public Builder setG(int g) {
            this.g = g;
            return this;
        }

        public VeryComplicatedObject build() {
            return new VeryComplicatedObject(a, b, c, d, e, f, g);
        }
    }

}
