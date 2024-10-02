package graficos;

public final class Sprite {

    public final int size;

    private int x;
    private int y;
    private HojaSprites hoja;
    public int[] pixeles;
    //personaje cabellero1
    public static Sprite caballeroDano = new Sprite(66, 0, 0, 0, HojaSprites.dano);
    public static Sprite caballeroDanoI = new Sprite(66, 0, 0, 4, HojaSprites.dano);

    public static Sprite caballero1_1d = new Sprite(64, 0, 0, 0, HojaSprites.caballeros);
    public static Sprite caballero1_2d = new Sprite(64, 1, 0, 0, HojaSprites.caballeros);
    public static Sprite caballero1_3d = new Sprite(64, 2, 0, 0, HojaSprites.caballeros);

    public static Sprite caballero1_1i = new Sprite(64, 0, 0, 4, HojaSprites.caballeros);
    public static Sprite caballero1_2i = new Sprite(64, 1, 0, 4, HojaSprites.caballeros);
    public static Sprite caballero1_3i = new Sprite(64, 2, 0, 4, HojaSprites.caballeros);
    //personaje cabellero2
    public static Sprite caballero2_1d = new Sprite(64, 0, 1, 0, HojaSprites.caballeros);
    public static Sprite caballero2_2d = new Sprite(64, 1, 1, 0, HojaSprites.caballeros);
    public static Sprite caballero2_3d = new Sprite(64, 2, 1, 0, HojaSprites.caballeros);

    public static Sprite caballero2_1i = new Sprite(64, 0, 1, 4, HojaSprites.caballeros);
    public static Sprite caballero2_2i = new Sprite(64, 1, 1, 4, HojaSprites.caballeros);
    public static Sprite caballero2_3i = new Sprite(64, 2, 1, 4, HojaSprites.caballeros);
    //personaje cabellero3
    public static Sprite caballero3_1d = new Sprite(64, 0, 2, 0, HojaSprites.caballeros);
    public static Sprite caballero3_2d = new Sprite(64, 1, 2, 0, HojaSprites.caballeros);
    public static Sprite caballero3_3d = new Sprite(64, 2, 2, 0, HojaSprites.caballeros);

    public static Sprite caballero3_1i = new Sprite(64, 0, 2, 4, HojaSprites.caballeros);
    public static Sprite caballero3_2i = new Sprite(64, 1, 2, 4, HojaSprites.caballeros);
    public static Sprite caballero3_3i = new Sprite(64, 2, 2, 4, HojaSprites.caballeros);
    //personaje mago1
    public static Sprite mago1_1d = new Sprite(64, 0, 0, 0, HojaSprites.magos);
    public static Sprite mago1_2d = new Sprite(64, 1, 0, 0, HojaSprites.magos);
    public static Sprite mago1_3d = new Sprite(64, 2, 0, 0, HojaSprites.magos);

    public static Sprite mago1_1i = new Sprite(64, 0, 0, 4, HojaSprites.magos);
    public static Sprite mago1_2i = new Sprite(64, 1, 0, 4, HojaSprites.magos);
    public static Sprite mago1_3i = new Sprite(64, 2, 0, 4, HojaSprites.magos);
    //personaje mago2
    public static Sprite mago2_1d = new Sprite(64, 0, 1, 0, HojaSprites.magos);
    public static Sprite mago2_2d = new Sprite(64, 1, 1, 0, HojaSprites.magos);
    public static Sprite mago2_3d = new Sprite(64, 2, 1, 0, HojaSprites.magos);

    public static Sprite mago2_1i = new Sprite(64, 0, 1, 4, HojaSprites.magos);
    public static Sprite mago2_2i = new Sprite(64, 1, 1, 4, HojaSprites.magos);
    public static Sprite mago2_3i = new Sprite(64, 2, 1, 4, HojaSprites.magos);
    //personaje mago3
    public static Sprite mago3_1d = new Sprite(64, 0, 2, 0, HojaSprites.magos);
    public static Sprite mago3_2d = new Sprite(64, 1, 2, 0, HojaSprites.magos);
    public static Sprite mago3_3d = new Sprite(64, 2, 2, 0, HojaSprites.magos);

    public static Sprite mago3_1i = new Sprite(64, 0, 2, 4, HojaSprites.magos);
    public static Sprite mago3_2i = new Sprite(64, 1, 2, 4, HojaSprites.magos);
    public static Sprite mago3_3i = new Sprite(64, 2, 2, 4, HojaSprites.magos);
    //personaje mago1
    public static Sprite bestia1_1d = new Sprite(64, 0, 0, 0, HojaSprites.bestias);
    public static Sprite bestia1_2d = new Sprite(64, 1, 0, 0, HojaSprites.bestias);
    public static Sprite bestia1_3d = new Sprite(64, 2, 0, 0, HojaSprites.bestias);

    public static Sprite bestia1_1i = new Sprite(64, 0, 0, 4, HojaSprites.bestias);
    public static Sprite bestia1_2i = new Sprite(64, 1, 0, 4, HojaSprites.bestias);
    public static Sprite bestia1_3i = new Sprite(64, 2, 0, 4, HojaSprites.bestias);
    //personaje mago2
    public static Sprite bestia2_1d = new Sprite(64, 0, 1, 0, HojaSprites.bestias);
    public static Sprite bestia2_2d = new Sprite(64, 1, 1, 0, HojaSprites.bestias);
    public static Sprite bestia2_3d = new Sprite(64, 2, 1, 0, HojaSprites.bestias);

    public static Sprite bestia2_1i = new Sprite(64, 0, 1, 4, HojaSprites.bestias);
    public static Sprite bestia2_2i = new Sprite(64, 1, 1, 4, HojaSprites.bestias);
    public static Sprite bestia2_3i = new Sprite(64, 2, 1, 4, HojaSprites.bestias);
    //personaje mago3
    public static Sprite bestia3_1d = new Sprite(64, 0, 2, 0, HojaSprites.bestias);
    public static Sprite bestia3_2d = new Sprite(64, 1, 2, 0, HojaSprites.bestias);
    public static Sprite bestia3_3d = new Sprite(64, 2, 2, 0, HojaSprites.bestias);

    public static Sprite bestia3_1i = new Sprite(64, 0, 2, 4, HojaSprites.bestias);
    public static Sprite bestia3_2i = new Sprite(64, 1, 2, 4, HojaSprites.bestias);
    public static Sprite bestia3_3i = new Sprite(64, 2, 2, 4, HojaSprites.bestias);
    //coleccion de sprites
    public static Sprite enemigo1_1d = new Sprite(64, 0, 0, 0, HojaSprites.enemigos);
    public static Sprite enemigo1_2d = new Sprite(64, 1, 0, 0, HojaSprites.enemigos);
    public static Sprite enemigo1_3d = new Sprite(64, 2, 0, 0, HojaSprites.enemigos);

    public static Sprite enemigo1_1i = new Sprite(64, 0, 0, 4, HojaSprites.enemigos);
    public static Sprite enemigo1_2i = new Sprite(64, 1, 0, 4, HojaSprites.enemigos);
    public static Sprite enemigo1_3i = new Sprite(64, 2, 0, 4, HojaSprites.enemigos);

    public static Sprite enemigo2_1d = new Sprite(64, 0, 1, 0, HojaSprites.enemigos);
    public static Sprite enemigo2_2d = new Sprite(64, 1, 1, 0, HojaSprites.enemigos);
    public static Sprite enemigo2_3d = new Sprite(64, 2, 1, 0, HojaSprites.enemigos);

    public static Sprite enemigo2_1i = new Sprite(64, 0, 1, 4, HojaSprites.enemigos);
    public static Sprite enemigo2_2i = new Sprite(64, 1, 1, 4, HojaSprites.enemigos);
    public static Sprite enemigo2_3i = new Sprite(64, 2, 1, 4, HojaSprites.enemigos);

    public static Sprite enemigo3_1d = new Sprite(64, 0, 2, 0, HojaSprites.enemigos);
    public static Sprite enemigo3_2d = new Sprite(64, 1, 2, 0, HojaSprites.enemigos);
    public static Sprite enemigo3_3d = new Sprite(64, 2, 2, 0, HojaSprites.enemigos);

    public static Sprite enemigo3_1i = new Sprite(64, 0, 2, 4, HojaSprites.enemigos);
    public static Sprite enemigo3_2i = new Sprite(64, 1, 2, 4, HojaSprites.enemigos);
    public static Sprite enemigo3_3i = new Sprite(64, 2, 2, 4, HojaSprites.enemigos);

    public static Sprite enemigo4_1d = new Sprite(64, 0, 3, 0, HojaSprites.enemigos);
    public static Sprite enemigo4_2d = new Sprite(64, 1, 3, 0, HojaSprites.enemigos);
    public static Sprite enemigo4_3d = new Sprite(64, 2, 3, 0, HojaSprites.enemigos);

    public static Sprite enemigo4_1i = new Sprite(64, 0, 3, 4, HojaSprites.enemigos);
    public static Sprite enemigo4_2i = new Sprite(64, 1, 3, 4, HojaSprites.enemigos);
    public static Sprite enemigo4_3i = new Sprite(64, 2, 3, 4, HojaSprites.enemigos);

    public static Sprite enemigo5_1d = new Sprite(64, 0, 4, 0, HojaSprites.enemigos);
    public static Sprite enemigo5_2d = new Sprite(64, 1, 4, 0, HojaSprites.enemigos);
    public static Sprite enemigo5_3d = new Sprite(64, 2, 4, 0, HojaSprites.enemigos);

    public static Sprite enemigo5_1i = new Sprite(64, 0, 4, 4, HojaSprites.enemigos);
    public static Sprite enemigo5_2i = new Sprite(64, 1, 4, 4, HojaSprites.enemigos);
    public static Sprite enemigo5_3i = new Sprite(64, 2, 4, 4, HojaSprites.enemigos);

    public static Sprite enemigo6_1d = new Sprite(64, 0, 5, 0, HojaSprites.enemigos);
    public static Sprite enemigo6_2d = new Sprite(64, 1, 5, 0, HojaSprites.enemigos);
    public static Sprite enemigo6_3d = new Sprite(64, 2, 5, 0, HojaSprites.enemigos);

    public static Sprite enemigo6_1i = new Sprite(64, 0, 5, 4, HojaSprites.enemigos);
    public static Sprite enemigo6_2i = new Sprite(64, 1, 5, 4, HojaSprites.enemigos);
    public static Sprite enemigo6_3i = new Sprite(64, 2, 5, 4, HojaSprites.enemigos);

    public static Sprite enemigo6danoD = new Sprite(62,  0,0,0, HojaSprites.enemigosDano);
    public static Sprite enemigo6danoI = new Sprite(62,  0,0,4, HojaSprites.enemigosDano);

    public static Sprite enemigo1danoD = new Sprite(62,  1,0,0, HojaSprites.enemigosDano);
    public static Sprite enemigo1danoI = new Sprite(62,  1,0,4, HojaSprites.enemigosDano);

    public static Sprite enemigo2danoD = new Sprite(62,  2,0,0, HojaSprites.enemigosDano);
    public static Sprite enemigo2danoI = new Sprite(62,  2,0,4, HojaSprites.enemigosDano);

    public static Sprite enemigo3danoD = new Sprite(62,  0,1,0, HojaSprites.enemigosDano);
    public static Sprite enemigo3danoI = new Sprite(62,  0,1,4, HojaSprites.enemigosDano); 

    public static Sprite enemigo4danoD = new Sprite(62,  1,1,0, HojaSprites.enemigosDano);
    public static Sprite enemigo4danoI = new Sprite(62,  1,1,4, HojaSprites.enemigosDano);

    public static Sprite enemigo5danoD = new Sprite(62,  2,1,0, HojaSprites.enemigosDano);
    public static Sprite enemigo5danoI = new Sprite(62,  2,1,4, HojaSprites.enemigosDano);
    //coleccion de sprites

    public static Sprite arma = new Sprite(45, 0, 0, 0, HojaSprites.arma1);
    public static Sprite arma1 = new Sprite(45, 0, 0, 0, HojaSprites.arma2);
    public static Sprite arma2 = new Sprite(45, 0, 0, 0, HojaSprites.arma3);
    //Arma movD
    public static Sprite sword = new Sprite(90, 0, 0, 0, HojaSprites.sword);
    public static Sprite sword1 = new Sprite(90, 1, 0, 0, HojaSprites.sword);
    public static Sprite sword2 = new Sprite(90, 2, 0, 0, HojaSprites.sword);
    public static Sprite sword3 = new Sprite(90, 3, 0, 0, HojaSprites.sword);
    public static Sprite sword4 = new Sprite(90, 0, 1, 0, HojaSprites.sword);
    public static Sprite sword5 = new Sprite(90, 1, 1, 0, HojaSprites.sword);
    public static Sprite sword6 = new Sprite(90, 2, 1, 0, HojaSprites.sword);
    public static Sprite sword7 = new Sprite(90, 3, 1, 0, HojaSprites.sword);
    public static Sprite sword8 = new Sprite(90, 0, 2, 0, HojaSprites.sword);

    //Arma movI
    public static Sprite swordi = new Sprite(90, 0, 0, 4, HojaSprites.sword);
    public static Sprite sword1i = new Sprite(90, 1, 0, 4, HojaSprites.sword);
    public static Sprite sword2i = new Sprite(90, 2, 0, 4, HojaSprites.sword);
    public static Sprite sword3i = new Sprite(90, 3, 0, 4, HojaSprites.sword);
    public static Sprite sword4i = new Sprite(90, 0, 1, 4, HojaSprites.sword);
    public static Sprite sword5i = new Sprite(90, 1, 1, 4, HojaSprites.sword);
    public static Sprite sword6i = new Sprite(90, 2, 1, 4, HojaSprites.sword);
    public static Sprite sword7i = new Sprite(90, 3, 1, 4, HojaSprites.sword);
    public static Sprite sword8i = new Sprite(90, 0, 2, 4, HojaSprites.sword);
    /////////////////
    public static Sprite sword1_2 = new Sprite(80, 0, 0, 0, HojaSprites.sword2);
    public static Sprite sword2_2 = new Sprite(80, 1, 0, 0, HojaSprites.sword2);
    public static Sprite sword3_2 = new Sprite(80, 2, 0, 0, HojaSprites.sword2);
    public static Sprite sword4_2 = new Sprite(80, 0, 1, 0, HojaSprites.sword2);
    public static Sprite sword5_2 = new Sprite(80, 1, 1, 0, HojaSprites.sword2);
    public static Sprite sword6_2 = new Sprite(80, 2, 1, 0, HojaSprites.sword2);

    //Arma movI
    public static Sprite sword1i_2 = new Sprite(80, 0, 0, 4, HojaSprites.sword2);
    public static Sprite sword2i_2 = new Sprite(80, 1, 0, 4, HojaSprites.sword2);
    public static Sprite sword3i_2 = new Sprite(80, 2, 0, 4, HojaSprites.sword2);
    public static Sprite sword4i_2 = new Sprite(80, 0, 1, 4, HojaSprites.sword2);
    public static Sprite sword5i_2 = new Sprite(80, 1, 1, 4, HojaSprites.sword2);
    public static Sprite sword6i_2 = new Sprite(80, 2, 1, 4, HojaSprites.sword2);

    public static Sprite sword1_3 = new Sprite(96, 0, 0, 0, HojaSprites.sword3);
    public static Sprite sword2_3 = new Sprite(96, 1, 0, 0, HojaSprites.sword3);
    public static Sprite sword3_3 = new Sprite(96, 2, 0, 0, HojaSprites.sword3);
    public static Sprite sword4_3 = new Sprite(96, 0, 1, 0, HojaSprites.sword3);
    public static Sprite sword5_3 = new Sprite(96, 1, 1, 0, HojaSprites.sword3);
    public static Sprite sword6_3 = new Sprite(96, 2, 1, 0, HojaSprites.sword3);

    //Arma movI
    public static Sprite sword1i_3 = new Sprite(96, 0, 0, 4, HojaSprites.sword3);
    public static Sprite sword2i_3 = new Sprite(96, 1, 0, 4, HojaSprites.sword3);
    public static Sprite sword3i_3 = new Sprite(96, 2, 0, 4, HojaSprites.sword3);
    public static Sprite sword4i_3 = new Sprite(96, 0, 1, 4, HojaSprites.sword3);
    public static Sprite sword5i_3 = new Sprite(96, 1, 1, 4, HojaSprites.sword3);
    public static Sprite sword6i_3 = new Sprite(96, 2, 1, 4, HojaSprites.sword3);

    public static Sprite sword1_4 = new Sprite(100, 0, 0, 0, HojaSprites.sword4);
    public static Sprite sword2_4 = new Sprite(100, 1, 0, 0, HojaSprites.sword4);
    public static Sprite sword3_4 = new Sprite(100, 2, 0, 0, HojaSprites.sword4);
    public static Sprite sword4_4 = new Sprite(100, 0, 1, 0, HojaSprites.sword4);
    public static Sprite sword5_4 = new Sprite(100, 1, 1, 0, HojaSprites.sword4);
    public static Sprite sword6_4 = new Sprite(100, 2, 1, 0, HojaSprites.sword4);

    //Arma movI
    public static Sprite sword1i_4 = new Sprite(100, 0, 0, 4, HojaSprites.sword4);
    public static Sprite sword2i_4 = new Sprite(100, 1, 0, 4, HojaSprites.sword4);
    public static Sprite sword3i_4 = new Sprite(100, 2, 0, 4, HojaSprites.sword4);
    public static Sprite sword4i_4 = new Sprite(100, 0, 1, 4, HojaSprites.sword4);
    public static Sprite sword5i_4 = new Sprite(100, 1, 1, 4, HojaSprites.sword4);
    public static Sprite sword6i_4 = new Sprite(100, 2, 1, 4, HojaSprites.sword4);

    public static Sprite sword1_5 = new Sprite(98, 0, 0, 0, HojaSprites.sword5);
    public static Sprite sword2_5 = new Sprite(98, 1, 0, 0, HojaSprites.sword5);
    public static Sprite sword3_5 = new Sprite(98, 2, 0, 0, HojaSprites.sword5);
    public static Sprite sword4_5 = new Sprite(98, 0, 1, 0, HojaSprites.sword5);
    public static Sprite sword5_5 = new Sprite(98, 1, 1, 0, HojaSprites.sword5);
    public static Sprite sword6_5 = new Sprite(98, 2, 1, 0, HojaSprites.sword5);

    //Arma movI
    public static Sprite sword1i_5 = new Sprite(98, 0, 0, 4, HojaSprites.sword5);
    public static Sprite sword2i_5 = new Sprite(98, 1, 0, 4, HojaSprites.sword5);
    public static Sprite sword3i_5 = new Sprite(98, 2, 0, 4, HojaSprites.sword5);
    public static Sprite sword4i_5 = new Sprite(98, 0, 1, 4, HojaSprites.sword5);
    public static Sprite sword5i_5 = new Sprite(98, 1, 1, 4, HojaSprites.sword5);
    public static Sprite sword6i_5 = new Sprite(98, 2, 1, 4, HojaSprites.sword5);

    public static Sprite sword1_6 = new Sprite(100, 0, 0, 0, HojaSprites.sword6);
    public static Sprite sword2_6 = new Sprite(100, 1, 0, 0, HojaSprites.sword6);
    public static Sprite sword3_6 = new Sprite(100, 2, 0, 0, HojaSprites.sword6);
    public static Sprite sword4_6 = new Sprite(100, 0, 1, 0, HojaSprites.sword6);
    public static Sprite sword5_6 = new Sprite(100, 1, 1, 0, HojaSprites.sword6);
    public static Sprite sword6_6 = new Sprite(100, 2, 1, 0, HojaSprites.sword6);

    //Arma movI
    public static Sprite sword1i_6 = new Sprite(100, 0, 0, 4, HojaSprites.sword6);
    public static Sprite sword2i_6 = new Sprite(100, 1, 0, 4, HojaSprites.sword6);
    public static Sprite sword3i_6 = new Sprite(100, 2, 0, 4, HojaSprites.sword6);
    public static Sprite sword4i_6 = new Sprite(100, 0, 1, 4, HojaSprites.sword6);
    public static Sprite sword5i_6 = new Sprite(100, 1, 1, 4, HojaSprites.sword6);
    public static Sprite sword6i_6 = new Sprite(100, 2, 1, 4, HojaSprites.sword6);

    public static Sprite sword1_7 = new Sprite(100, 0, 0, 0, HojaSprites.sword7);
    public static Sprite sword2_7 = new Sprite(100, 1, 0, 0, HojaSprites.sword7);
    public static Sprite sword3_7 = new Sprite(100, 2, 0, 0, HojaSprites.sword7);
    public static Sprite sword4_7 = new Sprite(100, 0, 1, 0, HojaSprites.sword7);
    public static Sprite sword5_7 = new Sprite(100, 1, 1, 0, HojaSprites.sword7);
    public static Sprite sword6_7 = new Sprite(100, 2, 1, 0, HojaSprites.sword7);

    //Arma movI
    public static Sprite sword1i_7 = new Sprite(100, 0, 0, 4, HojaSprites.sword7);
    public static Sprite sword2i_7 = new Sprite(100, 1, 0, 4, HojaSprites.sword7);
    public static Sprite sword3i_7 = new Sprite(100, 2, 0, 4, HojaSprites.sword7);
    public static Sprite sword4i_7 = new Sprite(100, 0, 1, 4, HojaSprites.sword7);
    public static Sprite sword5i_7 = new Sprite(100, 1, 1, 4, HojaSprites.sword7);
    public static Sprite sword6i_7 = new Sprite(100, 2, 1, 4, HojaSprites.sword7);

    public static Sprite sword1_8 = new Sprite(48, 0, 0, 0, HojaSprites.sword8);
    public static Sprite sword2_8 = new Sprite(48, 1, 0, 0, HojaSprites.sword8);
    public static Sprite sword3_8 = new Sprite(48, 2, 0, 0, HojaSprites.sword8);
    public static Sprite sword4_8 = new Sprite(48, 0, 1, 0, HojaSprites.sword8);
    public static Sprite sword5_8 = new Sprite(48, 1, 1, 0, HojaSprites.sword8);
    public static Sprite sword6_8 = new Sprite(48, 2, 1, 0, HojaSprites.sword8);
    public static Sprite sword7_8 = new Sprite(48, 0, 2, 0, HojaSprites.sword8);
    public static Sprite sword8_8 = new Sprite(48, 1, 2, 0, HojaSprites.sword8);

    //Arma movI
    public static Sprite sword1i_8 = new Sprite(48, 0, 0, 4, HojaSprites.sword8);
    public static Sprite sword2i_8 = new Sprite(48, 1, 0, 4, HojaSprites.sword8);
    public static Sprite sword3i_8 = new Sprite(48, 2, 0, 4, HojaSprites.sword8);
    public static Sprite sword4i_8 = new Sprite(48, 0, 1, 4, HojaSprites.sword8);
    public static Sprite sword5i_8 = new Sprite(48, 1, 1, 4, HojaSprites.sword8);
    public static Sprite sword6i_8 = new Sprite(48, 2, 1, 4, HojaSprites.sword8);
    public static Sprite sword7i_8 = new Sprite(48, 0, 2, 4, HojaSprites.sword8);
    public static Sprite sword8i_8 = new Sprite(48, 1, 2, 4, HojaSprites.sword8);

    public static Sprite sword1_9 = new Sprite(73, 0, 0, 0, HojaSprites.sword9);
    public static Sprite sword2_9 = new Sprite(73, 1, 0, 0, HojaSprites.sword9);
    public static Sprite sword3_9 = new Sprite(73, 2, 0, 0, HojaSprites.sword9);
    public static Sprite sword4_9 = new Sprite(73, 0, 1, 0, HojaSprites.sword9);
    public static Sprite sword5_9 = new Sprite(73, 1, 1, 0, HojaSprites.sword9);
    public static Sprite sword6_9 = new Sprite(73, 2, 1, 0, HojaSprites.sword9);
    public static Sprite sword7_9 = new Sprite(73, 0, 2, 0, HojaSprites.sword9);
    public static Sprite sword8_9 = new Sprite(73, 1, 2, 0, HojaSprites.sword9);

    //Arma movI
    public static Sprite sword1i_9 = new Sprite(73, 0, 0, 4, HojaSprites.sword9);
    public static Sprite sword2i_9 = new Sprite(73, 1, 0, 4, HojaSprites.sword9);
    public static Sprite sword3i_9 = new Sprite(73, 2, 0, 4, HojaSprites.sword9);
    public static Sprite sword4i_9 = new Sprite(73, 0, 1, 4, HojaSprites.sword9);
    public static Sprite sword5i_9 = new Sprite(73, 1, 1, 4, HojaSprites.sword9);
    public static Sprite sword6i_9 = new Sprite(73, 2, 1, 4, HojaSprites.sword9);
    public static Sprite sword7i_9 = new Sprite(73, 0, 2, 4, HojaSprites.sword9);
    public static Sprite sword8i_9 = new Sprite(73, 1, 2, 4, HojaSprites.sword9);

    public static Sprite sword1_10 = new Sprite(75, 0, 0, 0, HojaSprites.sword10);
    public static Sprite sword2_10 = new Sprite(75, 1, 0, 0, HojaSprites.sword10);
    public static Sprite sword3_10 = new Sprite(75, 2, 0, 0, HojaSprites.sword10);
    public static Sprite sword4_10 = new Sprite(75, 0, 1, 0, HojaSprites.sword10);
    public static Sprite sword5_10 = new Sprite(75, 1, 1, 0, HojaSprites.sword10);
    public static Sprite sword6_10 = new Sprite(75, 2, 1, 0, HojaSprites.sword10);
    public static Sprite sword7_10 = new Sprite(75, 0, 2, 0, HojaSprites.sword10);
    public static Sprite sword8_10 = new Sprite(75, 1, 2, 0, HojaSprites.sword10);

    //Arma movI
    public static Sprite sword1i_10 = new Sprite(75, 0, 0, 4, HojaSprites.sword10);
    public static Sprite sword2i_10 = new Sprite(75, 1, 0, 4, HojaSprites.sword10);
    public static Sprite sword3i_10 = new Sprite(75, 2, 0, 4, HojaSprites.sword10);
    public static Sprite sword4i_10 = new Sprite(75, 0, 1, 4, HojaSprites.sword10);
    public static Sprite sword5i_10 = new Sprite(75, 1, 1, 4, HojaSprites.sword10);
    public static Sprite sword6i_10 = new Sprite(75, 2, 1, 4, HojaSprites.sword10);
    public static Sprite sword7i_10 = new Sprite(75, 0, 2, 4, HojaSprites.sword10);
    public static Sprite sword8i_10 = new Sprite(75, 1, 2, 4, HojaSprites.sword10);

    public static Sprite sword1_11 = new Sprite(71, 0, 0, 0, HojaSprites.sword11);
    public static Sprite sword2_11 = new Sprite(71, 1, 0, 0, HojaSprites.sword11);
    public static Sprite sword3_11 = new Sprite(71, 2, 0, 0, HojaSprites.sword11);
    public static Sprite sword4_11 = new Sprite(71, 0, 1, 0, HojaSprites.sword11);
    public static Sprite sword5_11 = new Sprite(71, 1, 1, 0, HojaSprites.sword11);
    public static Sprite sword6_11 = new Sprite(71, 2, 1, 0, HojaSprites.sword11);
    public static Sprite sword7_11 = new Sprite(71, 0, 2, 0, HojaSprites.sword11);
    public static Sprite sword8_11 = new Sprite(71, 1, 2, 0, HojaSprites.sword11);

    //Arma movI
    public static Sprite sword1i_11 = new Sprite(71, 0, 0, 4, HojaSprites.sword11);
    public static Sprite sword2i_11 = new Sprite(71, 1, 0, 4, HojaSprites.sword11);
    public static Sprite sword3i_11 = new Sprite(71, 2, 0, 4, HojaSprites.sword11);
    public static Sprite sword4i_11 = new Sprite(71, 0, 1, 4, HojaSprites.sword11);
    public static Sprite sword5i_11 = new Sprite(71, 1, 1, 4, HojaSprites.sword11);
    public static Sprite sword6i_11 = new Sprite(71, 2, 1, 4, HojaSprites.sword11);
    public static Sprite sword7i_11 = new Sprite(71, 0, 2, 4, HojaSprites.sword11);
    public static Sprite sword8i_11 = new Sprite(71, 1, 2, 4, HojaSprites.sword11);

    public static Sprite sword1_12 = new Sprite(76, 0, 0, 0, HojaSprites.sword12);
    public static Sprite sword2_12 = new Sprite(76, 1, 0, 0, HojaSprites.sword12);
    public static Sprite sword3_12 = new Sprite(76, 2, 0, 0, HojaSprites.sword12);
    public static Sprite sword4_12 = new Sprite(76, 0, 1, 0, HojaSprites.sword12);
    public static Sprite sword5_12 = new Sprite(76, 1, 1, 0, HojaSprites.sword12);
    public static Sprite sword6_12 = new Sprite(76, 2, 1, 0, HojaSprites.sword12);
    public static Sprite sword7_12 = new Sprite(76, 0, 2, 0, HojaSprites.sword12);
    public static Sprite sword8_12 = new Sprite(76, 1, 2, 0, HojaSprites.sword12);

    //Arma movI
    public static Sprite sword1i_12 = new Sprite(76, 0, 0, 4, HojaSprites.sword12);
    public static Sprite sword2i_12 = new Sprite(76, 1, 0, 4, HojaSprites.sword12);
    public static Sprite sword3i_12 = new Sprite(76, 2, 0, 4, HojaSprites.sword12);
    public static Sprite sword4i_12 = new Sprite(76, 0, 1, 4, HojaSprites.sword12);
    public static Sprite sword5i_12 = new Sprite(76, 1, 1, 4, HojaSprites.sword12);
    public static Sprite sword6i_12 = new Sprite(76, 2, 1, 4, HojaSprites.sword12);
    public static Sprite sword7i_12 = new Sprite(76, 0, 2, 4, HojaSprites.sword12);
    public static Sprite sword8i_12 = new Sprite(76, 1, 2, 4, HojaSprites.sword12);

    //
    /////Mesa
    public static Sprite meson = new Sprite(32, 0, 2, 0, HojaSprites.desierto);
    public static Sprite meson1 = new Sprite(32, 1, 2, 0, HojaSprites.desierto);
    public static Sprite meson2 = new Sprite(32, 2, 2, 0, HojaSprites.desierto);
    public static Sprite meson3 = new Sprite(32, 3, 2, 0, HojaSprites.desierto);
    public static Sprite meson4 = new Sprite(32, 4, 2, 0, HojaSprites.desierto);
    public static Sprite meson5 = new Sprite(32, 5, 2, 0, HojaSprites.desierto);
    public static Sprite meson6 = new Sprite(32, 6, 2, 0, HojaSprites.desierto);
    public static Sprite meson7 = new Sprite(32, 7, 2, 0, HojaSprites.desierto);
    public static Sprite meson8 = new Sprite(32, 8, 2, 0, HojaSprites.desierto);
    public static Sprite meson9 = new Sprite(32, 9, 2, 0, HojaSprites.desierto);
    public static Sprite meson10 = new Sprite(32, 0, 3, 0, HojaSprites.desierto);
    public static Sprite meson11 = new Sprite(32, 1, 3, 0, HojaSprites.desierto);
    public static Sprite meson12 = new Sprite(32, 2, 3, 0, HojaSprites.desierto);
    public static Sprite meson13 = new Sprite(32, 3, 3, 0, HojaSprites.desierto);
    public static Sprite meson14 = new Sprite(32, 4, 3, 0, HojaSprites.desierto);
    public static Sprite meson15 = new Sprite(32, 5, 3, 0, HojaSprites.desierto);
    public static Sprite meson16 = new Sprite(32, 6, 3, 0, HojaSprites.desierto);
    public static Sprite meson17 = new Sprite(32, 7, 3, 0, HojaSprites.desierto);
    public static Sprite meson18 = new Sprite(32, 8, 3, 0, HojaSprites.desierto);
    public static Sprite meson19 = new Sprite(32, 9, 3, 0, HojaSprites.desierto);
    public static Sprite meson20 = new Sprite(32, 0, 4, 0, HojaSprites.desierto);
    public static Sprite meson21 = new Sprite(32, 1, 4, 0, HojaSprites.desierto);
    public static Sprite meson22 = new Sprite(32, 2, 4, 0, HojaSprites.desierto);
    public static Sprite meson23 = new Sprite(32, 3, 4, 0, HojaSprites.desierto);
    public static Sprite meson24 = new Sprite(32, 4, 4, 0, HojaSprites.desierto);
    public static Sprite meson25 = new Sprite(32, 5, 4, 0, HojaSprites.desierto);
    public static Sprite meson26 = new Sprite(32, 6, 4, 0, HojaSprites.desierto);
    public static Sprite meson27 = new Sprite(32, 7, 4, 0, HojaSprites.desierto);
    public static Sprite meson28 = new Sprite(32, 8, 4, 0, HojaSprites.desierto);
    public static Sprite meson29 = new Sprite(32, 9, 4, 0, HojaSprites.desierto);
    public static Sprite meson30 = new Sprite(32, 0, 5, 0, HojaSprites.desierto);
    public static Sprite meson31 = new Sprite(32, 1, 5, 0, HojaSprites.desierto);
    public static Sprite meson32 = new Sprite(32, 2, 5, 0, HojaSprites.desierto);
    public static Sprite meson33 = new Sprite(32, 3, 5, 0, HojaSprites.desierto);
    public static Sprite meson34 = new Sprite(32, 4, 5, 0, HojaSprites.desierto);
    public static Sprite meson35 = new Sprite(32, 5, 5, 0, HojaSprites.desierto);
    public static Sprite meson36 = new Sprite(32, 6, 5, 0, HojaSprites.desierto);
    public static Sprite meson37 = new Sprite(32, 7, 5, 0, HojaSprites.desierto);
    public static Sprite meson38 = new Sprite(32, 8, 5, 0, HojaSprites.desierto);
    public static Sprite meson39 = new Sprite(32, 9, 5, 0, HojaSprites.desierto);

    public static Sprite armas1 = new Sprite(80, 0, 0, 0, HojaSprites.armas);
    public static Sprite armas2 = new Sprite(80, 1, 0, 0, HojaSprites.armas);
    public static Sprite armas3 = new Sprite(80, 2, 0, 0, HojaSprites.armas);
    public static Sprite armas4 = new Sprite(80, 0, 1, 0, HojaSprites.armas);
    public static Sprite armas5 = new Sprite(80, 1, 1, 0, HojaSprites.armas);
    public static Sprite armas6 = new Sprite(80, 2, 1, 0, HojaSprites.armas);
    public static Sprite armas7 = new Sprite(80, 0, 2, 0, HojaSprites.armas);
    public static Sprite armas8 = new Sprite(80, 1, 2, 0, HojaSprites.armas);
    public static Sprite armas9 = new Sprite(80, 2, 2, 0, HojaSprites.armas);
    public static Sprite armas10 = new Sprite(80, 0, 3, 0, HojaSprites.armas);
    public static Sprite armas11 = new Sprite(80, 1, 3, 0, HojaSprites.armas);
    public static Sprite armas12 = new Sprite(80, 2, 3, 0, HojaSprites.armas);
    public static Sprite armasv = new Sprite(80, 0, 4, 0, HojaSprites.armas);

    public static Sprite ESPACIO = new Sprite(70, 0, 0, 0, HojaSprites.ESPACIO);
    /////
    public static Sprite suelo = new Sprite(32, 0, 0, 0, HojaSprites.desierto);
    public static Sprite suelo1 = new Sprite(32, 1, 0, 0, HojaSprites.desierto);
    public static Sprite suelo2 = new Sprite(32, 2, 0, 0, HojaSprites.desierto);
    public static Sprite paredlobby1 = new Sprite(32, 3, 0, 0, HojaSprites.desierto);
    public static Sprite paredlobby2 = new Sprite(32, 4, 0, 0, HojaSprites.desierto);
    public static Sprite paredlobby3 = new Sprite(32, 3, 1, 0, HojaSprites.desierto);
    public static Sprite paredlobby4 = new Sprite(32, 4, 1, 0, HojaSprites.desierto);
    public static Sprite paredlobby5 = new Sprite(32, 3, 1, 4, HojaSprites.desierto);
    public static Sprite paredlobby6 = new Sprite(32, 4, 1, 4, HojaSprites.desierto);
    public static Sprite azul = new Sprite(32, 6, 0, 0, HojaSprites.desierto);
    public static Sprite azulOscuro = new Sprite(32, 5, 0, 0, HojaSprites.desierto);
    public static Sprite piso = new Sprite(32, 7, 0, 0, HojaSprites.desierto);
    public static Sprite esquina1 = new Sprite(32, 5, 1, 0, HojaSprites.desierto);
    public static Sprite esquina2 = new Sprite(32, 5, 1, 4, HojaSprites.desierto);
    public static Sprite esquina3 = new Sprite(32, 5, 1, 1, HojaSprites.desierto);
    public static Sprite esquina4 = new Sprite(32, 5, 1, 6, HojaSprites.desierto);
    public static Sprite esquinaMesa1 = new Sprite(32, 1, 1, 0, HojaSprites.desierto);
    public static Sprite esquinaMesa2 = new Sprite(32, 1, 1, 4, HojaSprites.desierto);
    public static Sprite esquinaMesa3 = new Sprite(32, 0, 1, 0, HojaSprites.desierto);
    public static Sprite esquinaMesa4 = new Sprite(32, 0, 1, 4, HojaSprites.desierto);
    public static Sprite borde1 = new Sprite(32, 2, 1, 7, HojaSprites.desierto);
    public static Sprite borde2 = new Sprite(32, 2, 1, 0, HojaSprites.desierto);
    public static Sprite borde3 = new Sprite(32, 2, 1, 1, HojaSprites.desierto);
    public static Sprite borde4 = new Sprite(32, 2, 1, 2, HojaSprites.desierto);

    public static Sprite vacio = new Sprite(32, 0);
    public static Sprite barra = new Sprite(800, 0, 0, 0, HojaSprites.barra);
    public static Sprite bala = new Sprite(32, 0, 0, 0, HojaSprites.bala);
    public static Sprite bala2 = new Sprite(16, 0, 0, 0, HojaSprites.bala2);

    //fin de coleccion
    public Sprite(final int size, final int columna, final int fila, int version, final HojaSprites hoja) {
        this.size = size;
        pixeles = new int[size * size];

        this.x = columna * size;
        this.y = fila * size;
        this.hoja = hoja;
        cargarSprite(version);
    }

    public Sprite(int size, int color) {
        this.size = size;
        pixeles = new int[size * size];
        for (int i = 0; i < pixeles.length; i++) {
            pixeles[i] = color;
        }
    }

    private void cargarSprite(int version) {
        if (version == 0) {
            cargaNormal();
        } else {
            int[] pixelesTemp = iniciarPixeles();
            switch (version) {
                case 1:
                    cargaIzquierda(pixelesTemp);
                    break;
                case 2:
                    cargaDerecha(pixelesTemp);
                    break;
                case 3:
                    cargaAbajo(pixelesTemp);
                    break;
                case 4:
                    cargaNormalInvertida(pixelesTemp);
                    break;
                case 5:
                    cargaInvertidaIzquierda(pixelesTemp);
                    break;
                case 6:
                    cargaInvertidaDerecha(pixelesTemp);
                    break;
                case 7:
                    cargaInvertidaAbajo(pixelesTemp);
                    break;
                default:
                    cargaNormal();
            }
        }
    }

    private int[] iniciarPixeles() {
        int[] pixelesTemp = new int[size * size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                pixelesTemp[j + i * size] = hoja.pixeles[(j + this.x) + (i + this.y) * hoja.getAncho()];
            }
        }
        return pixelesTemp;
    }

    private void cargaNormal() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                pixeles[j + i * size] = hoja.pixeles[(j + this.x) + (i + this.y) * hoja.getAncho()];
            }
        }
    }

    private void cargaIzquierda(int[] pixelesTemp) {
        int r = 0;
        for (int j = size - 1; j > -1; j--) {
            for (int i = 0; i < size; i++) {
                pixeles[r] = pixelesTemp[j + i * size];
                r++;
            }
        }
    }

    private void cargaDerecha(int[] pixelesTemp) {
        int r = 0;
        for (int j = 0; j < size; j++) {
            for (int i = size - 1; i > -1; i--) {
                pixeles[r] = pixelesTemp[j + i * size];
                r++;
            }
        }
    }

    private void cargaAbajo(int[] pixelesTemp) {
        for (int i = 0; i < pixeles.length; i++) {
            pixeles[i] = pixelesTemp[pixelesTemp.length - 1 - i];
        }
    }

    private void cargaNormalInvertida(int[] pixelesTemp) {
        int r = 0;
        for (int i = 0; i < size; i++) {
            for (int j = size - 1; j > -1; j--) {
                pixeles[r] = pixelesTemp[j + i * size];
                r++;
            }
        }

    }

    private void cargaInvertidaIzquierda(int[] pixelesTemp) {
        int r = 0;
        for (int j = 0; j < size; j++) {
            for (int i = 0; i < size; i++) {
                pixeles[r] = pixelesTemp[j + i * size];
                r++;
            }
        }
    }

    private void cargaInvertidaDerecha(int[] pixelesTemp) {
        int r = 0;
        for (int j = size - 1; j > -1; j--) {
            for (int i = size - 1; i > -1; i--) {
                pixeles[r] = pixelesTemp[j + i * size];
                r++;
            }
        }
    }

    private void cargaInvertidaAbajo(int[] pixelesTemp) {
        int r = 0;
        for (int i = size - 1; i > -1; i--) {
            for (int j = 0; j < size; j++) {
                pixeles[r] = pixelesTemp[j + i * size];
                r++;
            }
        }
    }

}
