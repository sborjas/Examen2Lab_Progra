package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.audio.Music;



public class AIrHockey extends ApplicationAdapter {
	SpriteBatch batch;
	Texture fondo;
    Texture blue;
    Texture blue1;
    Music music;
    BitmapFont arial;

    //lineas arriba
    Texture cuadrado1;
    Texture cuadrado2;
    Texture cuadrado3;
    Texture cuadrado4;
    Texture cuadrado5;
    Texture cuadrado6;
    Texture cuadrado7;
    Texture cuadrado8;
    Texture cuadrado9;
    Texture cuadrado10;
    Texture cuad1;
    Texture cuad2;
    Texture cuad3;
    Texture cuad4;
    Texture cuad5;
    Texture cuad6;
    Texture cuad7;
    Texture cuad8;
    Texture cuad9;
    Texture cuad10;

    Texture cuadrado11;
    Texture cuadrado12;
    Texture cuadrado13;
    Texture cuadrado14;
    Texture cuadrado15;
    Texture cuadrado16;
    Texture cuadrado17;
    Texture cuadrado18;
    Texture cuadrado19;
    Texture cuadrado20;

    Texture cuadrado21;
    Texture cuadrado22;
    Texture cuadrado23;
    Texture cuadrado24;
    Texture cuadrado25;
    Texture cuadrado26;
    Texture cuadrado27;
    Texture cuadrado28;
    Texture cuadrado29;
    Texture cuadrado30;
    Texture cuadrado31;
    Texture cuadrado32;
    Texture cuadrado33;
    Texture cuadrado34;
    Texture cuadrado35;
    Texture cuadrado36;
    Texture cuadrado37;
    Texture cuadrado38;
    Texture cuadrado39;
    Texture cuadrado40;
    //------

    //lineas abajo
    Texture cuadrado1_2;
    Texture cuadrado2_2;
    Texture cuadrado3_2;
    Texture cuadrado4_2;
    Texture cuadrado5_2;
    Texture cuadrado6_2;
    Texture cuadrado7_2;
    Texture cuadrado8_2;
    Texture cuadrado9_2;
    Texture cuadrado10_2;

    Texture cuadrado11_2;
    Texture cuadrado12_2;
    Texture cuadrado13_2;
    Texture cuadrado14_2;
    Texture cuadrado15_2;
    Texture cuadrado16_2;
    Texture cuadrado17_2;
    Texture cuadrado18_2;
    Texture cuadrado19_2;
    Texture cuadrado20_2;

    Texture cuadrado21_2;
    Texture cuadrado22_2;
    Texture cuadrado23_2;
    Texture cuadrado24_2;
    Texture cuadrado25_2;
    Texture cuadrado26_2;
    Texture cuadrado27_2;
    Texture cuadrado28_2;
    Texture cuadrado29_2;
    Texture cuadrado30_2;

    Texture cuadrado31_2;
    Texture cuadrado32_2;
    Texture cuadrado33_2;
    Texture cuadrado34_2;
    Texture cuadrado35_2;
    Texture cuadrado36_2;
    Texture cuadrado37_2;
    Texture cuadrado38_2;
    Texture cuadrado39_2;
    Texture cuadrado40_2;
    //------

    //lineas abajo
    Texture cuadrado1_1;
    Texture cuadrado2_1;
    Texture cuadrado3_1;
    Texture cuadrado4_1;
    Texture cuadrado5_1;
    Texture cuadrado6_1;
    Texture cuadrado7_1;
    Texture cuadrado8_1;
    Texture cuadrado9_1;
    Texture cuadrado10_1;

    Texture cuadrado11_1;
    Texture cuadrado12_1;
    Texture cuadrado13_1;
    Texture cuadrado14_1;
    Texture cuadrado15_1;
    Texture cuadrado16_1;
    Texture cuadrado17_1;
    Texture cuadrado18_1;
    Texture cuadrado19_1;
    Texture cuadrado20_1;

    Texture cuadrado21_1;
    Texture cuadrado22_1;
    Texture cuadrado23_1;
    Texture cuadrado24_1;
    Texture cuadrado25_1;
    Texture cuadrado26_1;
    Texture cuadrado27_1;
    Texture cuadrado28_1;
    Texture cuadrado29_1;
    Texture cuadrado30_1;

    Texture cuadrado31_1;
    Texture cuadrado32_1;
    Texture cuadrado33_1;
    Texture cuadrado34_1;
    Texture cuadrado35_1;
    Texture cuadrado36_1;
    Texture cuadrado37_1;
    Texture cuadrado38_1;
    Texture cuadrado39_1;
    Texture cuadrado40_1;

    //en medio
    Texture cuadrado1_3;
    Texture cuadrado2_3;
    Texture cuadrado3_3;
    Texture cuadrado4_3;
    Texture cuadrado5_3;
    Texture cuadrado6_3;
    Texture cuadrado7_3;
    Texture cuadrado8_3;
    Texture cuadrado9_3;
    Texture cuadrado10_3;

    Texture cuadrado11_3;
    Texture cuadrado12_3;
    Texture cuadrado13_3;
    Texture cuadrado14_3;
    Texture cuadrado15_3;
    Texture cuadrado16_3;
    Texture cuadrado17_3;
    Texture cuadrado18_3;
    Texture cuadrado19_3;
    Texture cuadrado20_3;
    //

    Texture medio;

    int y =435;
    int x=590;

    int y1=0;
    int x1=0;

	@Override
	public void create () {
		batch = new SpriteBatch();

		fondo = new Texture("fondo.jpg");
        blue  = new Texture("blue.png");
        blue1 = new Texture("blue_.png");

        medio = new Texture("medio.jpg");

//laberinto inicio
        //lineas
        cuadrado1 = new Texture("negro.jpg");
        cuadrado2 = new Texture("negro.jpg");
        cuadrado3 = new Texture("negro.jpg");
        cuadrado4 = new Texture("negro.jpg");
        cuadrado5 = new Texture("negro.jpg");
        cuadrado6 = new Texture("negro.jpg");
        cuadrado7 = new Texture("negro.jpg");
        cuadrado8 = new Texture("negro.jpg");
        cuadrado9 = new Texture("negro.jpg");
        cuadrado10 = new Texture("negro.jpg");

        cuad1 = new Texture("negro.jpg");
        cuad2 = new Texture("negro.jpg");
        cuad3 = new Texture("negro.jpg");
        cuad4 = new Texture("negro.jpg");
        cuad5 = new Texture("negro.jpg");
        cuad6 = new Texture("negro.jpg");
        cuad7 = new Texture("negro.jpg");
        cuad8 = new Texture("negro.jpg");
        cuad9 = new Texture("negro.jpg");
        cuad10 = new Texture("negro.jpg");


        cuadrado11 = new Texture("negro.jpg");
        cuadrado12 = new Texture("negro.jpg");
        cuadrado13 = new Texture("negro.jpg");
        cuadrado14 = new Texture("negro.jpg");
        cuadrado15 = new Texture("negro.jpg");
        cuadrado16 = new Texture("negro.jpg");
        cuadrado17 = new Texture("negro.jpg");
        cuadrado18 = new Texture("negro.jpg");
        cuadrado19 = new Texture("negro.jpg");
        cuadrado20 = new Texture("negro.jpg");

        cuadrado21 = new Texture("negro.jpg");
        cuadrado22 = new Texture("negro.jpg");
        cuadrado23 = new Texture("negro.jpg");
        cuadrado24 = new Texture("negro.jpg");
        cuadrado25 = new Texture("negro.jpg");
        cuadrado26 = new Texture("negro.jpg");
        cuadrado27 = new Texture("negro.jpg");
        cuadrado28 = new Texture("negro.jpg");
        cuadrado29 = new Texture("negro.jpg");
        cuadrado30 = new Texture("negro.jpg");

        cuadrado31 = new Texture("negro.jpg");
        cuadrado32 = new Texture("negro.jpg");
        cuadrado33 = new Texture("negro.jpg");
        cuadrado34 = new Texture("negro.jpg");
        cuadrado35 = new Texture("negro.jpg");
        cuadrado36 = new Texture("negro.jpg");
        cuadrado37 = new Texture("negro.jpg");
        cuadrado38 = new Texture("negro.jpg");
        cuadrado39 = new Texture("negro.jpg");
        cuadrado40 = new Texture("negro.jpg");
        //-----

        //lineas abajo
        cuadrado1_1 = new Texture("negro.jpg");
        cuadrado2_1 = new Texture("negro.jpg");
        cuadrado3_1 = new Texture("negro.jpg");
        cuadrado4_1 = new Texture("negro.jpg");
        cuadrado5_1 = new Texture("negro.jpg");
        cuadrado6_1 = new Texture("negro.jpg");
        cuadrado7_1 = new Texture("negro.jpg");
        cuadrado8_1 = new Texture("negro.jpg");
        cuadrado9_1 = new Texture("negro.jpg");
        cuadrado10_1 = new Texture("negro.jpg");

        cuadrado11_1 = new Texture("negro.jpg");
        cuadrado12_1 = new Texture("negro.jpg");
        cuadrado13_1 = new Texture("negro.jpg");
        cuadrado14_1 = new Texture("negro.jpg");
        cuadrado15_1 = new Texture("negro.jpg");
        cuadrado16_1 = new Texture("negro.jpg");
        cuadrado17_1 = new Texture("negro.jpg");
        cuadrado18_1 = new Texture("negro.jpg");
        cuadrado19_1 = new Texture("negro.jpg");
        cuadrado20_1 = new Texture("negro.jpg");

        cuadrado21_1 = new Texture("negro.jpg");
        cuadrado22_1 = new Texture("negro.jpg");
        cuadrado23_1 = new Texture("negro.jpg");
        cuadrado24_1 = new Texture("negro.jpg");
        cuadrado25_1 = new Texture("negro.jpg");
        cuadrado26_1 = new Texture("negro.jpg");
        cuadrado27_1 = new Texture("negro.jpg");
        cuadrado28_1 = new Texture("negro.jpg");
        cuadrado29_1 = new Texture("negro.jpg");
        cuadrado30_1 = new Texture("negro.jpg");

        cuadrado31_1= new Texture("negro.jpg");
        cuadrado32_1= new Texture("negro.jpg");
        cuadrado33_1 = new Texture("negro.jpg");
        cuadrado34_1 = new Texture("negro.jpg");
        cuadrado35_1 = new Texture("negro.jpg");
        cuadrado36_1 = new Texture("negro.jpg");
        cuadrado37_1= new Texture("negro.jpg");
        cuadrado38_1 = new Texture("negro.jpg");
        cuadrado39_1 = new Texture("negro.jpg");
        cuadrado40_1 = new Texture("negro.jpg");
        //-----
        cuadrado1_2 = new Texture("negro.jpg");
        cuadrado2_2 = new Texture("negro.jpg");
        cuadrado3_2 = new Texture("negro.jpg");
        cuadrado4_2 = new Texture("negro.jpg");
        cuadrado5_2 = new Texture("negro.jpg");
        cuadrado6_2 = new Texture("negro.jpg");
        cuadrado7_2 = new Texture("negro.jpg");
        cuadrado8_2 = new Texture("negro.jpg");
        cuadrado9_2 = new Texture("negro.jpg");
        cuadrado10_2 = new Texture("negro.jpg");

        cuadrado11_2 = new Texture("negro.jpg");
        cuadrado12_2 = new Texture("negro.jpg");
        cuadrado13_2 = new Texture("negro.jpg");
        cuadrado14_2 = new Texture("negro.jpg");
        cuadrado15_2 = new Texture("negro.jpg");
        cuadrado16_2 = new Texture("negro.jpg");
        cuadrado17_2 = new Texture("negro.jpg");
        cuadrado18_2 = new Texture("negro.jpg");
        cuadrado19_2 = new Texture("negro.jpg");
        cuadrado20_2 = new Texture("negro.jpg");

        cuadrado21_2 = new Texture("negro.jpg");
        cuadrado22_2 = new Texture("negro.jpg");
        cuadrado23_2 = new Texture("negro.jpg");
        cuadrado24_2 = new Texture("negro.jpg");
        cuadrado25_2 = new Texture("negro.jpg");
        cuadrado26_2 = new Texture("negro.jpg");
        cuadrado27_2 = new Texture("negro.jpg");
        cuadrado28_2 = new Texture("negro.jpg");
        cuadrado29_2 = new Texture("negro.jpg");
        cuadrado30_2 = new Texture("negro.jpg");

        cuadrado31_2= new Texture("negro.jpg");
        cuadrado32_2= new Texture("negro.jpg");
        cuadrado33_2 = new Texture("negro.jpg");
        cuadrado34_2 = new Texture("negro.jpg");
        cuadrado35_2 = new Texture("negro.jpg");
        cuadrado36_2 = new Texture("negro.jpg");
        cuadrado37_2= new Texture("negro.jpg");
        cuadrado38_2 = new Texture("negro.jpg");
        cuadrado39_2 = new Texture("negro.jpg");
        cuadrado40_2 = new Texture("negro.jpg");
        //-----

        ///en medio
        cuadrado1_3 = new Texture("negro.jpg");
        cuadrado2_3 = new Texture("negro.jpg");
        cuadrado3_3 = new Texture("negro.jpg");
        cuadrado4_3 = new Texture("negro.jpg");
        cuadrado5_3 = new Texture("negro.jpg");
        cuadrado6_3 = new Texture("negro.jpg");
        cuadrado7_3 = new Texture("negro.jpg");
        cuadrado8_3 = new Texture("negro.jpg");
        cuadrado9_3 = new Texture("negro.jpg");
        cuadrado10_3 = new Texture("negro.jpg");

        cuadrado11_3 = new Texture("negro.jpg");
        cuadrado12_3 = new Texture("negro.jpg");
        cuadrado13_3 = new Texture("negro.jpg");
        cuadrado14_3 = new Texture("negro.jpg");
        cuadrado15_3 = new Texture("negro.jpg");
        cuadrado16_3 = new Texture("negro.jpg");
        cuadrado17_3 = new Texture("negro.jpg");
        cuadrado18_3 = new Texture("negro.jpg");
        cuadrado19_3 = new Texture("negro.jpg");
        cuadrado20_3 = new Texture("negro.jpg");
        ///

        int y = 0;
        int x = 0;

        int y1= 0;
        int x1= 0;

        music = Gdx.audio.newMusic(Gdx.files.internal("music.mp3"));
        music.play();
        arial = new BitmapFont();
	}

	@Override
	public void render () {


		batch.begin();
        batch.draw(fondo, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());

        batch.draw(medio,300,220,50,50);

        //lineas 1 INICIO
        batch.draw(cuadrado1,520,450,35,35);
        batch.draw(cuadrado2,490,450,35,35);
        batch.draw(cuadrado3, 460, 450, 35, 35);
        batch.draw(cuadrado4,430,450,35,35);
        batch.draw(cuadrado5,400,450,35,35);
        batch.draw(cuadrado6,370,450,35,35);
        batch.draw(cuadrado7,340,450,35,35);
        batch.draw(cuadrado8, 320, 450, 35, 35);
        batch.draw(cuadrado9,290,450,35,35);
        batch.draw(cuadrado10,230,450,35,35);
        batch.draw(cuadrado11,200,450,35,35);
        batch.draw(cuadrado12,270,450,35,35);
        batch.draw(cuadrado13,240, 450, 35, 35);
        batch.draw(cuadrado14,210,450,35,35);
        batch.draw(cuadrado15,180,450,35,35);
        batch.draw(cuadrado16,150,450,35,35);
        batch.draw(cuadrado17,120,450,35,35);
        batch.draw(cuadrado18,190,450, 35, 35);
        batch.draw(cuadrado19,160,450,35,35);
        batch.draw(cuadrado20,130,450,35,35);
        batch.draw(cuad1,100,450,35,35);
        batch.draw(cuad2,70,450,35,35);
        batch.draw(cuad3, 40, 450, 35, 35);
        batch.draw(cuad4,10,450,35,35);
        batch.draw(cuad5,0,450,35,35);
        //LINEA 1 FINAL



        //LINEA 2 INICIO
        batch.draw(cuadrado21,600,380,35,35);
        batch.draw(cuadrado22,570,380,35,35);
        batch.draw(cuadrado23,540, 380, 35, 35);
        batch.draw(cuadrado24,510,380,35,35);
        batch.draw(cuadrado25,480,380,35,35);
        batch.draw(cuadrado26,450,380,35,35);
        batch.draw(cuadrado27,420,380,35,35);
        batch.draw(cuadrado28,390, 380, 35, 35);
        batch.draw(cuadrado29,360,380,35,35);
        batch.draw(cuadrado30,330,380,35,35);
        batch.draw(cuadrado31,300,380,35,35);
        batch.draw(cuadrado32,270,380,35,35);
        batch.draw(cuadrado33,240, 380, 35, 35);
        batch.draw(cuadrado34,210,380,35,35);
        batch.draw(cuadrado35,280,380,35,35);
        batch.draw(cuadrado36,250,380,35,35);
        batch.draw(cuadrado37,220,380,35,35);
        batch.draw(cuadrado38,190, 380, 35, 35);
        batch.draw(cuadrado39,160,380,35,35);
        batch.draw(cuadrado40,130,380,35,35);
        //LINEA 2 FINAL

        //LINEA 3 INICIO
        batch.draw(cuadrado21_2,0,300, 35, 35);
        batch.draw(cuadrado22_2,30,300, 35, 35);
        batch.draw(cuadrado23_2,60,300, 35, 35);
        batch.draw(cuadrado24_2,90,300,35,35);
        batch.draw(cuadrado25_2,120,300,35,35);
        batch.draw(cuadrado26_2,150,300,35,35);
        batch.draw(cuadrado27_2,180,300,35,35);
        batch.draw(cuadrado28_2,210,300, 35, 35);
        batch.draw(cuadrado29_2,240,300,35,35);
        batch.draw(cuadrado30_2,270,300,35,35);
        batch.draw(cuadrado31_2,300,300,35,35);
        batch.draw(cuadrado32_2,330,300,35,35);
        batch.draw(cuadrado33_2,360,300, 35, 35);
        batch.draw(cuadrado34_2,390,300,35,35);
        batch.draw(cuadrado35_2,420,300,35,35);
        batch.draw(cuadrado36_2,450,300,35,35);
        batch.draw(cuadrado37_2,480,300,35,35);
        batch.draw(cuadrado38_2,510,300, 35, 35);
        batch.draw(cuadrado39_2,530,300,35,35);
        batch.draw(cuadrado40_2,560,300,35,35);
        // LINEA 3 FINAL

        //lineas abajo-------------------------------------------------------------------------------
        // LINEA 1 INICIO
        batch.draw(cuadrado1_1,50,0,35,35);
        batch.draw(cuadrado2_1,80,0,35,35);
        batch.draw(cuadrado3_1,110, 0, 35, 35);
        batch.draw(cuadrado4_1,140,0,35,35);
        batch.draw(cuadrado5_1,170,0,35,35);
        batch.draw(cuadrado6_1,200,0,35,35);
        batch.draw(cuadrado7_1,230,0,35,35);
        batch.draw(cuadrado8_1,260, 0, 35, 35);
        batch.draw(cuadrado9_1,290,0,35,35);
        batch.draw(cuadrado10_1,320,0,35,35);
        batch.draw(cuadrado11_1,350,0,35,35);
        batch.draw(cuadrado12_1,380,0,35,35);
        batch.draw(cuadrado13_1,410,0, 35, 35);
        batch.draw(cuadrado14_1,440,0,35,35);
        batch.draw(cuadrado15_1,470,0,35,35);
        batch.draw(cuadrado16_1,500,0,35,35);
        batch.draw(cuadrado17_1,530,0,35,35);
        batch.draw(cuadrado18_1,560,0, 35, 35);
        batch.draw(cuadrado19_1,590,0,35,35);
        batch.draw(cuadrado20_1,620,0,35,35);
        //LINEA 1 FINAL

        //linea abajo

        //LINEA 2 INICIO
        batch.draw(cuadrado23_1,510,80, 35, 35);
        batch.draw(cuadrado24_1,480,80,35,35);
        batch.draw(cuadrado25_1,450,80,35,35);
        batch.draw(cuadrado26_1,420,80,35,35);
        batch.draw(cuadrado27_1,390,80,35,35);
        batch.draw(cuadrado28_1,360,80, 35, 35);
        batch.draw(cuadrado29_1,330,80,35,35);
        batch.draw(cuadrado30_1,300,80,35,35);
        batch.draw(cuadrado31_1,270,80,35,35);
        batch.draw(cuadrado32_1,240,80,35,35);
        batch.draw(cuadrado33_1,210,80, 35, 35);
        batch.draw(cuadrado34_1,180,80,35,35);
        batch.draw(cuadrado35_1,150,80,35,35);
        batch.draw(cuadrado36_1,120,80,35,35);
        batch.draw(cuadrado37_1,90,80,35,35);
        batch.draw(cuadrado38_1,60,80, 35, 35);
        batch.draw(cuadrado39_1,30,80,35,35);
        batch.draw(cuadrado40_1,0,80,35,35);
        //LINEA 2 FINAL

        //linea abajo casi en medio

        //LINEA 3 INICIO
        batch.draw(cuadrado1_2,50,150,35,35);
        batch.draw(cuadrado2_2,80,150,35,35);
        batch.draw(cuadrado3_2,110, 150, 35, 35);
        batch.draw(cuadrado4_2,140,150,35,35);
        batch.draw(cuadrado5_2,170,150,35,35);
        batch.draw(cuadrado6_2,200,150,35,35);
        batch.draw(cuadrado7_2,230,150,35,35);
        batch.draw(cuadrado8_2,260, 150, 35, 35);
        batch.draw(cuadrado9_2,290,150,35,35);
        batch.draw(cuadrado10_2,320,150,35,35);
        batch.draw(cuadrado11_2,350,150,35,35);
        batch.draw(cuadrado12_2,380,150,35,35);
        batch.draw(cuadrado13_2,410,150, 35, 35);
        batch.draw(cuadrado14_2,440,150,35,35);
        batch.draw(cuadrado15_2,470,150,35,35);
        batch.draw(cuadrado16_2,500,150,35,35);
        batch.draw(cuadrado17_2,530,150,35,35);
        batch.draw(cuadrado18_2,560,150, 35, 35);
        batch.draw(cuadrado19_2,590,150,35,35);
        batch.draw(cuadrado20_2,620,150,35,35);
        // LINEA 3 FINAL
        //-----

        //linea enmedio
        //LINEA 4 INICIO
        batch.draw(cuadrado1_3,400,220,35,35);
        batch.draw(cuadrado2_3,430,220,35,35);
        batch.draw(cuadrado3_3,460, 220, 35, 35);
        batch.draw(cuadrado4_3,490,220,35,35);
        batch.draw(cuadrado5_3,520,220,35,35);
        batch.draw(cuadrado6_3,550,220,35,35);
        batch.draw(cuadrado7_3,580,220,35,35);
        batch.draw(cuadrado8_3,610,220, 35, 35);
        batch.draw(cuadrado9_3,640,220,35,35);
        batch.draw(cuadrado10_3,670,220,35,35);


        batch.draw(cuadrado11_3,0,220,35,35);
        batch.draw(cuadrado12_3,30,220,35,35);
        batch.draw(cuadrado13_3,60,220, 35, 35);
        batch.draw(cuadrado14_3,90,220,35,35);
        batch.draw(cuadrado15_3,120,220,35,35);
        batch.draw(cuadrado16_3,150,220,35,35);
        batch.draw(cuadrado17_3,180,220,35,35);
        batch.draw(cuadrado18_3,210,220, 35, 35);
        batch.draw(cuadrado19_3,240,220,35,35);
        batch.draw(cuadrado20_3,260,220,35,35);
        //LINEA 4 FINAL


        // ----------------------




		batch.end();


		batch.begin();
		batch.draw(blue, x, y, 35, 35); //player 1
        batch.draw(blue1, x1, y1, 35, 35); //player 2
		batch.end();

        //+--------------------Player1 INICIO-------------------------+
        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
            x+=2;
        }

        if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){
            x-=2;
        }

        if(Gdx.input.isKeyPressed(Input.Keys.UP)){
            y+=2;
        }
        if(Gdx.input.isKeyPressed(Input.Keys.DOWN)){
            y-=2;
        }

        if((x<0 || x>630) || (y<0 || y>480)) {
            x=590;
            y=435;
            System.out.println("Player1 chocaste con el limite...regresas al inicio muajajajaj"); 
        }


        if((x>300 && x<310) && (y>220 && y<230)) {
            System.out.println("Player 1 gano!!!");
            x1=0;
            y1=0;

            y =435;
            x=590;
            return;
        }

        //CHOQUE EN PRIMERA FILA
        if((y>420)&&(x<540)){
            System.out.println("Player1 chocaste con el limite...regresas al inicio muajajajaj");
            y=435;
            x=590;
        }

        //CHOQUE EN SEGUNDA FILA
        if((x<620 && x>130)&&(y<410&&y>345)){
            System.out.println("Player1 chocaste con el limite...regresas al inicio muajajajaj");
            y=435;
            x=590;
        }

        //CHOQUE EN TERCERA FILA
        if((x>0 && x<560)&&(y>270 && y<330)){
            System.out.println("Player1 chocaste con el limite...regresas al inicio muajajajaj");
            y=435;
            x=590;
        }

        //CHOQUE 4 FILA
        if((x>380 && x<690)&& (y<250)){
            System.out.println("Player1 chocaste con el limite...regresas al inicio muajajajaj");
            y=435;
            x=590;
        }




      //+--------------------Player1 FIN--------------------------+


        //+--------------------Player2 INICIO-------------------------+
        if(Gdx.input.isKeyPressed(Input.Keys.D)){
            x1+=2;
        }

        if(Gdx.input.isKeyPressed(Input.Keys.A)){
            x1-=2;
        }

        if(Gdx.input.isKeyPressed(Input.Keys.W)){
            y1+=2;
        }
        if(Gdx.input.isKeyPressed(Input.Keys.Z)){
            y1-=2;
        }

        if((x1<0 || x1>630) || (y1<0 || y1>480)) {
            x1=0;
            y1=0;

            System.out.println("Player 2 chocaste con el limite...regresas al inicio muajajajaj");
        }

        if((x1>300 && x1<310) && (y1>220 && y1<230)) {
            System.out.println("Player 2 gano!!!");

            x1=0;
            y1=0;

            y =435;
            x=590;
            return;

        }

        //CHOQUE 1 FILA
        if((x1>30 && y1<30)){
            System.out.println("Player2 chocaste con el limite...regresas al inicio muajajajaj");
            y1=0;
            x1=0;
        }

        //CHOQUE 2 FILA
        if((x1>=0 && x1<520)&& (y1>55 && y1<110)){
            System.out.println("Player2 chocaste con el limite...regresas al inicio muajajajaj");
            y1=0;
            x1=0;
        }

        //CHOQUE 3 FILA
        if((x1>40 && x1<620)&& (y1>120 && y1<180)){
            System.out.println("Player2 chocaste con el limite...regresas al inicio muajajajaj");
            y1=0;
            x1=0;
        }

        //CHOQUE 4 FILA
        if((x1>0 && x1<270)&& (y1>220)){
            System.out.println("Player2 chocaste con el limite...regresas al inicio muajajajaj");
            y1=435;
            x1=590;
        }

        //+--------------------Player2 FIN--------------------------+





	}
}

