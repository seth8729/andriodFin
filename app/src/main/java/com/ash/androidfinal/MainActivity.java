package com.ash.androidfinal;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mBtn1,mBtn2,mBtn3,mBtn4,mBtn5,mBtn6,mBtn7,mBtn8,mBtn9,
    mBtn11,mBtn12,mBtn13,mBtn14,mBtn15,mBtn16,mBtn17,mBtn18,mBtn19,
    mBtn21,mBtn22,mBtn23,mBtn24,mBtn25,mBtn26,mBtn27,mBtn28,mBtn29,
    mBtn31,mBtn32,mBtn33,mBtn34,mBtn35,mBtn36,mBtn37,mBtn38,mBtn39,
    mBtn41,mBtn42,mBtn43,mBtn44,mBtn45,mBtn46,mBtn47,mBtn48,mBtn49,
    mBtn51,mBtn52,mBtn53,mBtn54,mBtn55,mBtn56,mBtn57,mBtn58,mBtn59,
    mBtn61,mBtn62,mBtn63,mBtn64,mBtn65,mBtn66,mBtn67,mBtn68,mBtn69,
    mBtn71,mBtn72,mBtn73,mBtn74,mBtn75,mBtn76,mBtn77,mBtn78,mBtn79,
    mBtn81,mBtn82,mBtn83,mBtn84,mBtn85,mBtn86,mBtn87,mBtn88,mBtn89;
    private Button mBtnEx1,mBtnEx2,mBtnEx3,mBtnEx4,mBtnEx5,mBtnEx6,mBtnEx7,mBtnEx8,mBtnEx9;
    private Button mBtnClean,mBtnReset,mBtnTip;

    String[][] board = {{"０","０","０","０","０","０","０","０","０"},{"０","０","０","０","０","０","０","０","０"},{"０","０","０","０","０","０","０","０","０"},
                        {"０","０","０","０","０","０","０","０","０"},{"０","０","０","０","０","０","０","０","０"},{"０","０","０","０","０","０","０","０","０"},
                        {"０","０","０","０","０","０","０","０","０"},{"０","０","０","０","０","０","０","０","０"},{"０","０","０","０","０","０","０","０","０"}};
    String[][] temp = {{}};
    String currentNumber = "１";
    String[] number = {"０","１","２","３","４","５","６","７","８","９"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnClean = (Button) findViewById(R.id.btnClean);
        mBtnReset = (Button) findViewById(R.id.btnClear);
        mBtnTip = (Button) findViewById(R.id.btnTip);

        mBtnClean.setOnClickListener(mBtnCleanOnClick);
        mBtnReset.setOnClickListener(mBtnResetOnClick);
        mBtnTip.setOnClickListener(mBtnTipOnClick);

        mBtnEx1 = (Button) findViewById(R.id.btnEx1);
        mBtnEx2 = (Button) findViewById(R.id.btnEx2);
        mBtnEx3 = (Button) findViewById(R.id.btnEx3);
        mBtnEx4 = (Button) findViewById(R.id.btnEx4);
        mBtnEx5 = (Button) findViewById(R.id.btnEx5);
        mBtnEx6 = (Button) findViewById(R.id.btnEx6);
        mBtnEx7 = (Button) findViewById(R.id.btnEx7);
        mBtnEx8 = (Button) findViewById(R.id.btnEx8);
        mBtnEx9 = (Button) findViewById(R.id.btnEx9);

        mBtnEx1.setOnClickListener(mBtnEx1OnClick);
        mBtnEx2.setOnClickListener(mBtnEx2OnClick);
        mBtnEx3.setOnClickListener(mBtnEx3OnClick);
        mBtnEx4.setOnClickListener(mBtnEx4OnClick);
        mBtnEx5.setOnClickListener(mBtnEx5OnClick);
        mBtnEx6.setOnClickListener(mBtnEx6OnClick);
        mBtnEx7.setOnClickListener(mBtnEx7OnClick);
        mBtnEx8.setOnClickListener(mBtnEx8OnClick);
        mBtnEx9.setOnClickListener(mBtnEx9OnClick);


        mBtn1 = (Button) findViewById(R.id.button1);
        mBtn2 = (Button) findViewById(R.id.button2);
        mBtn3 = (Button) findViewById(R.id.button3);
        mBtn4 = (Button) findViewById(R.id.button4);
        mBtn5 = (Button) findViewById(R.id.button5);
        mBtn6 = (Button) findViewById(R.id.button6);
        mBtn7 = (Button) findViewById(R.id.button7);
        mBtn8 = (Button) findViewById(R.id.button8);
        mBtn9 = (Button) findViewById(R.id.button9);
        mBtn11 = (Button) findViewById(R.id.button11);
        mBtn12 = (Button) findViewById(R.id.button12);
        mBtn13 = (Button) findViewById(R.id.button13);
        mBtn14 = (Button) findViewById(R.id.button14);
        mBtn15 = (Button) findViewById(R.id.button15);
        mBtn16 = (Button) findViewById(R.id.button16);
        mBtn17 = (Button) findViewById(R.id.button17);
        mBtn18 = (Button) findViewById(R.id.button18);
        mBtn19 = (Button) findViewById(R.id.button19);
        mBtn21 = (Button) findViewById(R.id.button21);
        mBtn22 = (Button) findViewById(R.id.button22);
        mBtn23 = (Button) findViewById(R.id.button23);
        mBtn24 = (Button) findViewById(R.id.button24);
        mBtn25 = (Button) findViewById(R.id.button25);
        mBtn26 = (Button) findViewById(R.id.button26);
        mBtn27 = (Button) findViewById(R.id.button27);
        mBtn28 = (Button) findViewById(R.id.button28);
        mBtn29 = (Button) findViewById(R.id.button29);
        mBtn31 = (Button) findViewById(R.id.button31);
        mBtn32 = (Button) findViewById(R.id.button32);
        mBtn33 = (Button) findViewById(R.id.button33);
        mBtn34 = (Button) findViewById(R.id.button34);
        mBtn35 = (Button) findViewById(R.id.button35);
        mBtn36 = (Button) findViewById(R.id.button36);
        mBtn37 = (Button) findViewById(R.id.button37);
        mBtn38 = (Button) findViewById(R.id.button38);
        mBtn39 = (Button) findViewById(R.id.button39);
        mBtn41 = (Button) findViewById(R.id.button41);
        mBtn42 = (Button) findViewById(R.id.button42);
        mBtn43 = (Button) findViewById(R.id.button43);
        mBtn44 = (Button) findViewById(R.id.button44);
        mBtn45 = (Button) findViewById(R.id.button45);
        mBtn46 = (Button) findViewById(R.id.button46);
        mBtn47 = (Button) findViewById(R.id.button47);
        mBtn48 = (Button) findViewById(R.id.button48);
        mBtn49 = (Button) findViewById(R.id.button49);
        mBtn51 = (Button) findViewById(R.id.button51);
        mBtn52 = (Button) findViewById(R.id.button52);
        mBtn53 = (Button) findViewById(R.id.button53);
        mBtn54 = (Button) findViewById(R.id.button54);
        mBtn55 = (Button) findViewById(R.id.button55);
        mBtn56 = (Button) findViewById(R.id.button56);
        mBtn57 = (Button) findViewById(R.id.button57);
        mBtn58 = (Button) findViewById(R.id.button58);
        mBtn59 = (Button) findViewById(R.id.button59);
        mBtn61 = (Button) findViewById(R.id.button61);
        mBtn62 = (Button) findViewById(R.id.button62);
        mBtn63 = (Button) findViewById(R.id.button63);
        mBtn64 = (Button) findViewById(R.id.button64);
        mBtn65 = (Button) findViewById(R.id.button65);
        mBtn66 = (Button) findViewById(R.id.button66);
        mBtn67 = (Button) findViewById(R.id.button67);
        mBtn68 = (Button) findViewById(R.id.button68);
        mBtn69 = (Button) findViewById(R.id.button69);
        mBtn71 = (Button) findViewById(R.id.button71);
        mBtn72 = (Button) findViewById(R.id.button72);
        mBtn73 = (Button) findViewById(R.id.button73);
        mBtn74 = (Button) findViewById(R.id.button74);
        mBtn75 = (Button) findViewById(R.id.button75);
        mBtn76 = (Button) findViewById(R.id.button76);
        mBtn77 = (Button) findViewById(R.id.button77);
        mBtn78 = (Button) findViewById(R.id.button78);
        mBtn79 = (Button) findViewById(R.id.button79);
        mBtn81 = (Button) findViewById(R.id.button81);
        mBtn82 = (Button) findViewById(R.id.button82);
        mBtn83 = (Button) findViewById(R.id.button83);
        mBtn84 = (Button) findViewById(R.id.button84);
        mBtn85 = (Button) findViewById(R.id.button85);
        mBtn86 = (Button) findViewById(R.id.button86);
        mBtn87 = (Button) findViewById(R.id.button87);
        mBtn88 = (Button) findViewById(R.id.button88);
        mBtn89 = (Button) findViewById(R.id.button89);

        mBtn1.setOnClickListener(mBtn1OnClick);
        mBtn2.setOnClickListener(mBtn2OnClick);
        mBtn3.setOnClickListener(mBtn3OnClick);
        mBtn4.setOnClickListener(mBtn4OnClick);
        mBtn5.setOnClickListener(mBtn5OnClick);
        mBtn6.setOnClickListener(mBtn6OnClick);
        mBtn7.setOnClickListener(mBtn7OnClick);
        mBtn8.setOnClickListener(mBtn8OnClick);
        mBtn9.setOnClickListener(mBtn9OnClick);
//        mBtn11.setOnClickListener(mBtn11OnClick);
//        mBtn12.setOnClickListener(mBtn12OnClick);
//        mBtn13.setOnClickListener(mBtn13OnClick);
//        mBtn14.setOnClickListener(mBtn14OnClick);
//        mBtn15.setOnClickListener(mBtn15OnClick);
//        mBtn16.setOnClickListener(mBtn16OnClick);
//        mBtn17.setOnClickListener(mBtn17OnClick);
//        mBtn18.setOnClickListener(mBtn18OnClick);
//        mBtn19.setOnClickListener(mBtn19OnClick);
//        mBtn21.setOnClickListener(mBtn21OnClick);
//        mBtn22.setOnClickListener(mBtn22OnClick);
//        mBtn23.setOnClickListener(mBtn23OnClick);
//        mBtn24.setOnClickListener(mBtn24OnClick);
//        mBtn25.setOnClickListener(mBtn25OnClick);
//        mBtn26.setOnClickListener(mBtn26OnClick);
//        mBtn27.setOnClickListener(mBtn27OnClick);
//        mBtn28.setOnClickListener(mBtn28OnClick);
//        mBtn29.setOnClickListener(mBtn29OnClick);
//        mBtn31.setOnClickListener(mBtn31OnClick);
//        mBtn32.setOnClickListener(mBtn32OnClick);
//        mBtn33.setOnClickListener(mBtn33OnClick);
//        mBtn34.setOnClickListener(mBtn34OnClick);
//        mBtn35.setOnClickListener(mBtn35OnClick);
//        mBtn36.setOnClickListener(mBtn36OnClick);
//        mBtn37.setOnClickListener(mBtn37OnClick);
//        mBtn38.setOnClickListener(mBtn38OnClick);
//        mBtn39.setOnClickListener(mBtn39OnClick);
//        mBtn41.setOnClickListener(mBtn41OnClick);
//        mBtn42.setOnClickListener(mBtn42OnClick);
//        mBtn43.setOnClickListener(mBtn43OnClick);
//        mBtn44.setOnClickListener(mBtn44OnClick);
//        mBtn45.setOnClickListener(mBtn45OnClick);
//        mBtn46.setOnClickListener(mBtn46OnClick);
//        mBtn47.setOnClickListener(mBtn47OnClick);
//        mBtn48.setOnClickListener(mBtn48OnClick);
//        mBtn49.setOnClickListener(mBtn49OnClick);
//        mBtn51.setOnClickListener(mBtn51OnClick);
//        mBtn52.setOnClickListener(mBtn52OnClick);
//        mBtn53.setOnClickListener(mBtn53OnClick);
//        mBtn54.setOnClickListener(mBtn54OnClick);
//        mBtn55.setOnClickListener(mBtn55OnClick);
//        mBtn56.setOnClickListener(mBtn56OnClick);
//        mBtn57.setOnClickListener(mBtn57OnClick);
//        mBtn58.setOnClickListener(mBtn58OnClick);
//        mBtn59.setOnClickListener(mBtn59OnClick);
//        mBtn61.setOnClickListener(mBtn61OnClick);
//        mBtn62.setOnClickListener(mBtn62OnClick);
//        mBtn63.setOnClickListener(mBtn63OnClick);
//        mBtn64.setOnClickListener(mBtn64OnClick);
//        mBtn65.setOnClickListener(mBtn65OnClick);
//        mBtn66.setOnClickListener(mBtn66OnClick);
//        mBtn67.setOnClickListener(mBtn67OnClick);
//        mBtn68.setOnClickListener(mBtn68OnClick);
//        mBtn69.setOnClickListener(mBtn69OnClick);
//        mBtn71.setOnClickListener(mBtn71OnClick);
//        mBtn72.setOnClickListener(mBtn72OnClick);
//        mBtn73.setOnClickListener(mBtn73OnClick);
//        mBtn74.setOnClickListener(mBtn74OnClick);
//        mBtn75.setOnClickListener(mBtn75OnClick);
//        mBtn76.setOnClickListener(mBtn76OnClick);
//        mBtn77.setOnClickListener(mBtn77OnClick);
//        mBtn78.setOnClickListener(mBtn78OnClick);
//        mBtn79.setOnClickListener(mBtn79OnClick);
//        mBtn81.setOnClickListener(mBtn81OnClick);
//        mBtn82.setOnClickListener(mBtn82OnClick);
//        mBtn83.setOnClickListener(mBtn83OnClick);
//        mBtn84.setOnClickListener(mBtn84OnClick);
//        mBtn85.setOnClickListener(mBtn85OnClick);
//        mBtn86.setOnClickListener(mBtn86OnClick);
//        mBtn87.setOnClickListener(mBtn87OnClick);
//        mBtn88.setOnClickListener(mBtn88OnClick);
//        mBtn89.setOnClickListener(mBtn89OnClick);

        mBtn1.setText(board[0][0]);
        mBtn2.setText(board[0][1]);
        mBtn3.setText(board[0][2]);
        mBtn4.setText(board[0][3]);
        mBtn5.setText(board[0][4]);
        mBtn6.setText(board[0][5]);
        mBtn7.setText(board[0][6]);
        mBtn8.setText(board[0][7]);
        mBtn9.setText(board[0][8]);
        mBtn11.setText(board[1][0]);
        mBtn12.setText(board[1][1]);
        mBtn13.setText(board[1][2]);
        mBtn14.setText(board[1][3]);
        mBtn15.setText(board[1][4]);
        mBtn16.setText(board[1][5]);
        mBtn17.setText(board[1][6]);
        mBtn18.setText(board[1][7]);
        mBtn19.setText(board[1][8]);
        mBtn21.setText(board[2][0]);
        mBtn22.setText(board[2][1]);
        mBtn23.setText(board[2][2]);
        mBtn24.setText(board[2][3]);
        mBtn25.setText(board[2][4]);
        mBtn26.setText(board[2][5]);
        mBtn27.setText(board[2][6]);
        mBtn28.setText(board[2][7]);
        mBtn29.setText(board[2][8]);
        mBtn31.setText(board[3][0]);
        mBtn32.setText(board[3][1]);
        mBtn33.setText(board[3][2]);
        mBtn34.setText(board[3][3]);
        mBtn35.setText(board[3][4]);
        mBtn36.setText(board[3][5]);
        mBtn37.setText(board[3][6]);
        mBtn38.setText(board[3][7]);
        mBtn39.setText(board[3][8]);
        mBtn41.setText(board[4][0]);
        mBtn42.setText(board[4][1]);
        mBtn43.setText(board[4][2]);
        mBtn44.setText(board[4][3]);
        mBtn45.setText(board[4][4]);
        mBtn46.setText(board[4][5]);
        mBtn47.setText(board[4][6]);
        mBtn48.setText(board[4][7]);
        mBtn49.setText(board[4][8]);
        mBtn51.setText(board[5][0]);
        mBtn52.setText(board[5][1]);
        mBtn53.setText(board[5][2]);
        mBtn54.setText(board[5][3]);
        mBtn55.setText(board[5][4]);
        mBtn56.setText(board[5][5]);
        mBtn57.setText(board[5][6]);
        mBtn58.setText(board[5][7]);
        mBtn59.setText(board[5][8]);
        mBtn61.setText(board[6][0]);
        mBtn62.setText(board[6][1]);
        mBtn63.setText(board[6][2]);
        mBtn64.setText(board[6][3]);
        mBtn65.setText(board[6][4]);
        mBtn66.setText(board[6][5]);
        mBtn67.setText(board[6][6]);
        mBtn68.setText(board[6][7]);
        mBtn69.setText(board[6][8]);
        mBtn71.setText(board[7][0]);
        mBtn72.setText(board[7][1]);
        mBtn73.setText(board[7][2]);
        mBtn74.setText(board[7][3]);
        mBtn75.setText(board[7][4]);
        mBtn76.setText(board[7][5]);
        mBtn77.setText(board[7][6]);
        mBtn78.setText(board[7][7]);
        mBtn79.setText(board[7][8]);
        mBtn81.setText(board[8][0]);
        mBtn82.setText(board[8][1]);
        mBtn83.setText(board[8][2]);
        mBtn84.setText(board[8][3]);
        mBtn85.setText(board[8][4]);
        mBtn86.setText(board[8][5]);
        mBtn87.setText(board[8][6]);
        mBtn88.setText(board[8][7]);
        mBtn89.setText(board[8][8]);
        temp = board;
    }

    private void Win() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setMessage("恭喜你，你贏了!!!")
                .setPositiveButton("重新開始", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // 左方按鈕方法
                        mBtn1.setText(board[0][0]);
                        mBtn2.setText(board[0][1]);
                        mBtn3.setText(board[0][2]);
                        mBtn4.setText(board[0][3]);
                        mBtn5.setText(board[0][4]);
                        mBtn6.setText(board[0][5]);
                        mBtn7.setText(board[0][6]);
                        mBtn8.setText(board[0][7]);
                        mBtn9.setText(board[0][8]);
                        mBtn11.setText(board[1][0]);
                        mBtn12.setText(board[1][1]);
                        mBtn13.setText(board[1][2]);
                        mBtn14.setText(board[1][3]);
                        mBtn15.setText(board[1][4]);
                        mBtn16.setText(board[1][5]);
                        mBtn17.setText(board[1][6]);
                        mBtn18.setText(board[1][7]);
                        mBtn19.setText(board[1][8]);
                        mBtn21.setText(board[2][0]);
                        mBtn22.setText(board[2][1]);
                        mBtn23.setText(board[2][2]);
                        mBtn24.setText(board[2][3]);
                        mBtn25.setText(board[2][4]);
                        mBtn26.setText(board[2][5]);
                        mBtn27.setText(board[2][6]);
                        mBtn28.setText(board[2][7]);
                        mBtn29.setText(board[2][8]);
                        mBtn31.setText(board[3][0]);
                        mBtn32.setText(board[3][1]);
                        mBtn33.setText(board[3][2]);
                        mBtn34.setText(board[3][3]);
                        mBtn35.setText(board[3][4]);
                        mBtn36.setText(board[3][5]);
                        mBtn37.setText(board[3][6]);
                        mBtn38.setText(board[3][7]);
                        mBtn39.setText(board[3][8]);
                        mBtn41.setText(board[4][0]);
                        mBtn42.setText(board[4][1]);
                        mBtn43.setText(board[4][2]);
                        mBtn44.setText(board[4][3]);
                        mBtn45.setText(board[4][4]);
                        mBtn46.setText(board[4][5]);
                        mBtn47.setText(board[4][6]);
                        mBtn48.setText(board[4][7]);
                        mBtn49.setText(board[4][8]);
                        mBtn51.setText(board[5][0]);
                        mBtn52.setText(board[5][1]);
                        mBtn53.setText(board[5][2]);
                        mBtn54.setText(board[5][3]);
                        mBtn55.setText(board[5][4]);
                        mBtn56.setText(board[5][5]);
                        mBtn57.setText(board[5][6]);
                        mBtn58.setText(board[5][7]);
                        mBtn59.setText(board[5][8]);
                        mBtn61.setText(board[6][0]);
                        mBtn62.setText(board[6][1]);
                        mBtn63.setText(board[6][2]);
                        mBtn64.setText(board[6][3]);
                        mBtn65.setText(board[6][4]);
                        mBtn66.setText(board[6][5]);
                        mBtn67.setText(board[6][6]);
                        mBtn68.setText(board[6][7]);
                        mBtn69.setText(board[6][8]);
                        mBtn71.setText(board[7][0]);
                        mBtn72.setText(board[7][1]);
                        mBtn73.setText(board[7][2]);
                        mBtn74.setText(board[7][3]);
                        mBtn75.setText(board[7][4]);
                        mBtn76.setText(board[7][5]);
                        mBtn77.setText(board[7][6]);
                        mBtn78.setText(board[7][7]);
                        mBtn79.setText(board[7][8]);
                        mBtn81.setText(board[8][0]);
                        mBtn82.setText(board[8][1]);
                        mBtn83.setText(board[8][2]);
                        mBtn84.setText(board[8][3]);
                        mBtn85.setText(board[8][4]);
                        mBtn86.setText(board[8][5]);
                        mBtn87.setText(board[8][6]);
                        mBtn88.setText(board[8][7]);
                        mBtn89.setText(board[8][8]);
                }
                })
                .setNegativeButton("離開", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // 右方按鈕方法
                        System.exit(0);
                    }
                });
        AlertDialog about_dialog = builder.create();
        about_dialog.show();
    }
    private View.OnClickListener mBtnCleanOnClick = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            mBtnEx1.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx2.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx3.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx4.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx5.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx6.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx7.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx8.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx9.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            currentNumber = "";
        }
    };
    private View.OnClickListener mBtnResetOnClick = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            temp = board;
            mBtn1.setText(board[0][0]);
            mBtn2.setText(board[0][1]);
            mBtn3.setText(board[0][2]);
            mBtn4.setText(board[0][3]);
            mBtn5.setText(board[0][4]);
            mBtn6.setText(board[0][5]);
            mBtn7.setText(board[0][6]);
            mBtn8.setText(board[0][7]);
            mBtn9.setText(board[0][8]);
            mBtn11.setText(board[1][0]);
            mBtn12.setText(board[1][1]);
            mBtn13.setText(board[1][2]);
            mBtn14.setText(board[1][3]);
            mBtn15.setText(board[1][4]);
            mBtn16.setText(board[1][5]);
            mBtn17.setText(board[1][6]);
            mBtn18.setText(board[1][7]);
            mBtn19.setText(board[1][8]);
            mBtn21.setText(board[2][0]);
            mBtn22.setText(board[2][1]);
            mBtn23.setText(board[2][2]);
            mBtn24.setText(board[2][3]);
            mBtn25.setText(board[2][4]);
            mBtn26.setText(board[2][5]);
            mBtn27.setText(board[2][6]);
            mBtn28.setText(board[2][7]);
            mBtn29.setText(board[2][8]);
            mBtn31.setText(board[3][0]);
            mBtn32.setText(board[3][1]);
            mBtn33.setText(board[3][2]);
            mBtn34.setText(board[3][3]);
            mBtn35.setText(board[3][4]);
            mBtn36.setText(board[3][5]);
            mBtn37.setText(board[3][6]);
            mBtn38.setText(board[3][7]);
            mBtn39.setText(board[3][8]);
            mBtn41.setText(board[4][0]);
            mBtn42.setText(board[4][1]);
            mBtn43.setText(board[4][2]);
            mBtn44.setText(board[4][3]);
            mBtn45.setText(board[4][4]);
            mBtn46.setText(board[4][5]);
            mBtn47.setText(board[4][6]);
            mBtn48.setText(board[4][7]);
            mBtn49.setText(board[4][8]);
            mBtn51.setText(board[5][0]);
            mBtn52.setText(board[5][1]);
            mBtn53.setText(board[5][2]);
            mBtn54.setText(board[5][3]);
            mBtn55.setText(board[5][4]);
            mBtn56.setText(board[5][5]);
            mBtn57.setText(board[5][6]);
            mBtn58.setText(board[5][7]);
            mBtn59.setText(board[5][8]);
            mBtn61.setText(board[6][0]);
            mBtn62.setText(board[6][1]);
            mBtn63.setText(board[6][2]);
            mBtn64.setText(board[6][3]);
            mBtn65.setText(board[6][4]);
            mBtn66.setText(board[6][5]);
            mBtn67.setText(board[6][6]);
            mBtn68.setText(board[6][7]);
            mBtn69.setText(board[6][8]);
            mBtn71.setText(board[7][0]);
            mBtn72.setText(board[7][1]);
            mBtn73.setText(board[7][2]);
            mBtn74.setText(board[7][3]);
            mBtn75.setText(board[7][4]);
            mBtn76.setText(board[7][5]);
            mBtn77.setText(board[7][6]);
            mBtn78.setText(board[7][7]);
            mBtn79.setText(board[7][8]);
            mBtn81.setText(board[8][0]);
            mBtn82.setText(board[8][1]);
            mBtn83.setText(board[8][2]);
            mBtn84.setText(board[8][3]);
            mBtn85.setText(board[8][4]);
            mBtn86.setText(board[8][5]);
            mBtn87.setText(board[8][6]);
            mBtn88.setText(board[8][7]);
            mBtn89.setText(board[8][8]);
        }
    };
    private View.OnClickListener mBtnTipOnClick = new View.OnClickListener() {

        @Override
        public void onClick(View v) {

        }
    };
    private View.OnClickListener mBtnEx1OnClick = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            mBtnEx1.setBackgroundColor(getResources().getColor(R.color.colorBlack));
            mBtnEx2.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx3.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx4.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx5.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx6.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx7.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx8.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx9.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            currentNumber = getResources().getString(R.string.one);
        }
    };
    private View.OnClickListener mBtnEx2OnClick = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            mBtnEx1.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx2.setBackgroundColor(getResources().getColor(R.color.colorBlack));
            mBtnEx3.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx4.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx5.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx6.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx7.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx8.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx9.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            currentNumber = getResources().getString(R.string.two);
        }
    };
    private View.OnClickListener mBtnEx3OnClick = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            mBtnEx1.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx2.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx3.setBackgroundColor(getResources().getColor(R.color.colorBlack));
            mBtnEx4.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx5.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx6.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx7.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx8.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx9.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            currentNumber = getResources().getString(R.string.three);
        }
    };
    private View.OnClickListener mBtnEx4OnClick = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            mBtnEx1.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx2.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx3.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx4.setBackgroundColor(getResources().getColor(R.color.colorBlack));
            mBtnEx5.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx6.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx7.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx8.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx9.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            currentNumber = getResources().getString(R.string.four);
        }
    };
    private View.OnClickListener mBtnEx5OnClick = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            mBtnEx1.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx2.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx3.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx4.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx5.setBackgroundColor(getResources().getColor(R.color.colorBlack));
            mBtnEx6.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx7.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx8.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx9.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            currentNumber = getResources().getString(R.string.five);
        }
    };
    private View.OnClickListener mBtnEx6OnClick = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            mBtnEx1.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx2.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx3.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx4.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx5.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx6.setBackgroundColor(getResources().getColor(R.color.colorBlack));
            mBtnEx7.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx8.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx9.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            currentNumber = getResources().getString(R.string.six);
        }
    };
    private View.OnClickListener mBtnEx7OnClick = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            mBtnEx1.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx2.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx3.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx4.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx5.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx6.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx7.setBackgroundColor(getResources().getColor(R.color.colorBlack));
            mBtnEx8.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx9.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            currentNumber = getResources().getString(R.string.seven);
        }
    };
    private View.OnClickListener mBtnEx8OnClick = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            mBtnEx1.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx2.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx3.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx4.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx5.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx6.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx7.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx8.setBackgroundColor(getResources().getColor(R.color.colorBlack));
            mBtnEx9.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            currentNumber = getResources().getString(R.string.eight);
        }
    };
    private View.OnClickListener mBtnEx9OnClick = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            mBtnEx1.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx2.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx3.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx4.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx5.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx6.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx7.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx8.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            mBtnEx9.setBackgroundColor(getResources().getColor(R.color.colorBlack));
            currentNumber = getResources().getString(R.string.nine);
        }
    };

    private View.OnClickListener mBtn1OnClick = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            boolean win = true;
            mBtn1.setText(currentNumber);
            temp[0][0] = currentNumber;
            for(int i =0; i < 9; i++){
                if(temp[0][i] == currentNumber && i != 0) {
                    mBtn1.setTextColor(getResources().getColor(R.color.colorRed));
                    win = false;
                    break;
                }
                else if(temp[i][0] == currentNumber && i != 0){
                    mBtn1.setTextColor(getResources().getColor(R.color.colorRed));
                    win = false;
                    break;
                }
                else mBtn1.setTextColor(getResources().getColor(R.color.colorBlack));
            }
            if(win) {
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 9; j++) {
                        if (temp[i][j] == "０") win = false;
                    }
                }
                if(win){
                    Win();
                }
            }
        }
    };
    private View.OnClickListener mBtn2OnClick = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            boolean win = true;
            mBtn2.setText(currentNumber);
            temp[0][1] = currentNumber;
            for(int i =0; i < 9; i++){
                if(temp[0][i] == currentNumber && i != 1) {
                    mBtn2.setTextColor(getResources().getColor(R.color.colorRed));
                    win = false;
                    break;
                }
                else if(temp[i][0] == currentNumber && i != 0){
                    mBtn2.setTextColor(getResources().getColor(R.color.colorRed));
                    win = false;
                    break;
                }
                else mBtn2.setTextColor(getResources().getColor(R.color.colorBlack));
            }
            if(win) {
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 9; j++) {
                        if (temp[i][j] == "０") win = false;
                    }
                }
                if(win){
                    Win();
                }
            }
        }
    };
    private View.OnClickListener mBtn3OnClick = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            mBtn3.setText(currentNumber);
            temp[0][2] = currentNumber;
            boolean win = true;
            for(int i =0; i < 9; i++){
                if(temp[0][i] == currentNumber && i != 2) {
                    mBtn3.setTextColor(getResources().getColor(R.color.colorRed));
                    win = false;
                    break;
                }
                else if(temp[i][0] == currentNumber && i != 0){
                    mBtn3.setTextColor(getResources().getColor(R.color.colorRed));
                    win = false;
                    break;
                }
                else mBtn3.setTextColor(getResources().getColor(R.color.colorBlack));
            }
            if(win) {
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 9; j++) {
                        if (temp[i][j] == "０") win = false;
                    }
                }
                if(win){
                    Win();
                }
            }
        }
    };
    private View.OnClickListener mBtn4OnClick = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            mBtn4.setText(currentNumber);
            temp[0][3] = currentNumber;
            boolean win = true;
            for(int i =0; i < 9; i++){
                if(temp[0][i] == currentNumber && i != 3) {
                    mBtn4.setTextColor(getResources().getColor(R.color.colorRed));
                    win = false;
                    break;
                }
                else if(temp[i][0] == currentNumber && i != 0){
                    mBtn4.setTextColor(getResources().getColor(R.color.colorRed));
                    win = false;
                    break;
                }
                else mBtn4.setTextColor(getResources().getColor(R.color.colorWhite));
            }
            if(win) {
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 9; j++) {
                        if (temp[i][j] == "０") win = false;
                    }
                }
                if(win){
                    Win();
                }
            }
        }
    };
    private View.OnClickListener mBtn5OnClick = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            mBtn5.setText(currentNumber);
            temp[0][4] = currentNumber;
            boolean win = true;
            for(int i =0; i < 9; i++){
                if(temp[0][i] == currentNumber && i != 4) {
                    mBtn5.setTextColor(getResources().getColor(R.color.colorRed));
                    win = false;
                    break;
                }
                else if(temp[i][0] == currentNumber && i != 0){
                    mBtn5.setTextColor(getResources().getColor(R.color.colorRed));
                    win = false;
                    break;
                }
                else mBtn5.setTextColor(getResources().getColor(R.color.colorWhite));
            }
            if(win) {
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 9; j++) {
                        if (temp[i][j] == "０") win = false;
                    }
                }
                if(win){
                    Win();
                }
            }
        }
    };
    private View.OnClickListener mBtn6OnClick = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            mBtn6.setText(currentNumber);
            temp[0][5] = currentNumber;
            boolean win = true;
            for(int i =0; i < 9; i++){
                if(temp[0][i] == currentNumber && i != 5) {
                    mBtn6.setTextColor(getResources().getColor(R.color.colorRed));
                    win = false;
                    break;
                }
                else if(temp[i][0] == currentNumber && i != 0){
                    mBtn6.setTextColor(getResources().getColor(R.color.colorRed));
                    win = false;
                    break;
                }
                else mBtn6.setTextColor(getResources().getColor(R.color.colorWhite));
            }
            if(win) {
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 9; j++) {
                        if (temp[i][j] == "０") win = false;
                    }
                }
                if(win){
                    Win();
                }
            }
        }
    };
    private View.OnClickListener mBtn7OnClick = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            mBtn7.setText(currentNumber);
            temp[0][6] = currentNumber;
            boolean win = true;
            for(int i =0; i < 9; i++){
                if(temp[0][i] == currentNumber && i != 6) {
                    mBtn7.setTextColor(getResources().getColor(R.color.colorRed));
                    win = false;
                    break;
                }
                else if(temp[i][0] == currentNumber && i != 0){
                    mBtn7.setTextColor(getResources().getColor(R.color.colorRed));
                    win = false;
                    break;
                }
                else mBtn7.setTextColor(getResources().getColor(R.color.colorBlack));
            }
            if(win) {
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 9; j++) {
                        if (temp[i][j] == "０") win = false;
                    }
                }
                if(win){
                    Win();
                }
            }
        }
    };
    private View.OnClickListener mBtn8OnClick = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            mBtn8.setText(currentNumber);
            temp[0][7] = currentNumber;
            boolean win = true;
            for(int i =0; i < 9; i++){
                if(temp[0][i] == currentNumber && i != 7) {
                    mBtn8.setTextColor(getResources().getColor(R.color.colorRed));
                    win = false;
                    break;
                }
                else if(temp[i][0] == currentNumber && i != 0){
                    mBtn8.setTextColor(getResources().getColor(R.color.colorRed));
                    win = false;
                    break;
                }
                else mBtn8.setTextColor(getResources().getColor(R.color.colorBlack));
            }
            if(win) {
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 9; j++) {
                        if (temp[i][j] == "０") win = false;
                    }
                }
                if(win){
                    Win();
                }
            }
        }
    };
    private View.OnClickListener mBtn9OnClick = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            mBtn9.setText(currentNumber);
            temp[0][8] = currentNumber;
            boolean win = true;
            for(int i =0; i < 9; i++){
                if(temp[0][i] == currentNumber && i != 8) {
                    mBtn9.setTextColor(getResources().getColor(R.color.colorRed));
                    win = false;
                    break;
                }
                else if(temp[i][0] == currentNumber && i != 0){
                    mBtn9.setTextColor(getResources().getColor(R.color.colorRed));
                    win = false;
                    break;
                }
                else mBtn9.setTextColor(getResources().getColor(R.color.colorBlack));
            }
            if(win) {
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 9; j++) {
                        if (temp[i][j] == "０") win = false;
                    }
                }
                if(win){
                    Win();
                }
            }
        }
    };

}
