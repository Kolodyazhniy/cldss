class Box {
    double width;
    double height;
    double depth;
    // отображение объема параллелепипеда
    void volume() {
        System.out.print("Объем равен ");
        System.out.println(width * height * depth);
    }
}

class BoxDemo3 {
    public static void main(String args[]) {
        Box myboxl = new Box();
        Box mybox2 = new Box();
// присваивание значений переменным экземпляра myboxl
        myboxl.width = 10;
        myboxl.height = 20;
        myboxl.depth = 15;
/* присваивание других значений переменным
экземпляра mybox2 */
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9 ;
// отображение объема первого параллелепипеда
        myboxl.volume();
// отображение объема второго параллелепипеда
        mybox2.volume();
    }
}