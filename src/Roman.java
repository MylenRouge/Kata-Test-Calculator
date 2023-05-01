public enum Roman {
    O(0),I(1), II(2), III(3), IV(4), V(5), VI(6), VII(7), VIII(8), IX(9), X(10);

    private final int value;
    Roman(int value) {
        this.value = value;
    }
    public int toInt() {
        return value;
    }
//    ConvertNumToRoman (int value){
//        String[] name = Roman.name();
//        return name;
//    }
}
