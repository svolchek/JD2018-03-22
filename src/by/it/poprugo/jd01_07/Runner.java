package by.it.poprugo.jd01_07;

public class Runner {
    public static void main(String[] args) {
        AbstractVar s1=new Scalar(3.1415);
        AbstractVar s2=s1;
        AbstractVar s3=new Scalar("3.1415");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        double[] vect1={1.0, 2.0, 3.0};
        AbstractVar v1=new Vector(vect1);
        System.out.println("из массива double : "+v1);
        double[] vect2={1.0, 2.0, 4.0};
        v1= new Vector(vect2);
        AbstractVar v2=v1;
        System.out.println("из другого вектора : "+v2);
        String vect3="1.0, 2.0, 5.0";
        AbstractVar v3= new Vector(vect3);
        System.out.println("из строки : "+v3);
        double[][] matr1 = {{1.0, 2.0}, {3.0, 4.0}};
        AbstractVar m1 = new Matrix(matr1);
        System.out.println("из массива double : " + m1);
        double[][] matr2 = {{1.0, 2.0}, {4.0, 8.0}};
        m1 = new Matrix(matr2);
        AbstractVar m2 = m1;
        System.out.println("из другой матрицы : " + m2);

        String matr3 = "{{1.0, 2.0}, {3.0, 4.0}}";
        AbstractVar m3= new Matrix(matr3);
        System.out.println("из строки : "+m3);

        /*AbstractVar s = new Scalar(3.14);

        Object o = new Scalar(10);

        double[] arr={1.0, 2.0, 4.0};
        //AbstractVar v = new Vector("1.0, 2.0, 4.0");
        Vector v=new Vector(arr);

        for (int i = 0; i < 2; i++) {
            System.out.println(v);
        }
        System.out.println(o);*/
    }
}
