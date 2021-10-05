package com.people.todolist.utils.enumeration;

public enum ProfessionEnum {

    SOFTWARE_ENGINEER(1){
        public String toString(){
            return "id: 1, profession: dancer";
        }
    },
    HARDWARE_ENGINEER(2){
        public String toString(){
            return "id: 2, profession: singer";
        }
    },
    QA_ENGINEER(3){
        public String toString(){
            return "id: 3, profession: programmer";
        }
    };
    private int id;
    ProfessionEnum(int id) {
        this.id =id;
    }

    public int getId() {
        return id;
    }

    public static ProfessionEnum  getById(int id)  {
        for(ProfessionEnum type : values()) {
            if(type.id == (id))
                return type;
        }

        return null;
    }
}
