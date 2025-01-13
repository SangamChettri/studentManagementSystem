public class Student {
     String name;
        int age;
        public Student(String name,int age){
            this.name=name;
            this.age=age;
        }
        void setName(String name){
            this.name=name;
        }
        void setAge(int age){
            this.age=age;
        }
        String getName(){
            return this.name;
        }
        int getAge(){
            return this.age;
        }
}
