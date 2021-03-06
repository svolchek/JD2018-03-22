package by.it.verishko.jd01_07;

class Vector extends AbstractVar {
    private double[] value;

    Vector(double[] value) {
        this.value = value;
    }

    Vector (Vector vector){
        this.value = vector.value;
    }

    Vector(String strVector) {
        String[] s = strVector.substring(1, strVector.length() - 1).split(",");
        value = new double[s.length];
        for (int i = 0; i <s.length ; i++) {
            value[i] = Double.parseDouble(s[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        String del = "";
        for (double element : value) {
            sb.append(del).append(element);
            del = ", ";
        }
        sb.append("}");
        return sb.toString();
    }
}
