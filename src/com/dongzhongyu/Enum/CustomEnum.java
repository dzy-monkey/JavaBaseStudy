package com.dongzhongyu.Enum;

public class CustomEnum {
    public static void main(String[] args) {
        RoleTypeEnum rt1 = RoleTypeEnum.TEACHER;
        RoleTypeEnum rt2 = RoleTypeEnum.STUDENT;
        System.out.println(rt1.ordinal());
        System.out.println(rt2.ordinal());

        SeasonEnum s1 = SeasonEnum.FALL;
        SeasonEnum s2 = SeasonEnum.WINTER;
        System.out.println(s1);
        //获取到枚举类型整型的值
        System.out.println(s2.ordinal());
        //遍历枚举类型的值
        for (SeasonEnum se : SeasonEnum.values()){
            System.out.println(se);
        }
    }
}
