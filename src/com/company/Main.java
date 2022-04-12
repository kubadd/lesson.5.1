package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setChooseBossDefence("human");
        boss.setHealth(500);
        boss.setDamage(250);
        System.out.println(boss.getHealth() + " " + boss.getDamage() + " " + boss.getChooseBossDefence() ) ;
    }
}
