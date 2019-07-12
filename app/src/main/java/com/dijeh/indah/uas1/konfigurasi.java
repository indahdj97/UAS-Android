package com.dijeh.indah.uas1;

public class konfigurasi {
    public static final String URL_ADD="http://192.168.43.213/pendaftaran/tambah.php";
    public static final String URL_GET_ALL = "http://192.168.43.213/pendaftaran/tampilSemua.php";
    //public static final String URL_GET_EMP = "http://192.168.43.213/pendaftaran/tampil.php?id=";
    //public static final String URL_UPDATE_EMP = "http://192.168.43.213/portalberita/pengajuan/ePengajuan.php";
    //public static final String URL_DELETE_EMP = "http://192.168.43.213/portalberita/pengajuan/delete.php?id=";

    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP
    public static final String KEY_PENG_ID = "id";
    public static final String KEY_PENG_NIK = "nik";
    public static final String KEY_PENG_NAMA = "nama"; //variabel untuk nama
    public static final String KEY_PENG_JK = "jenis_kelamin"; //variabel untuk jenis_kelamin
    public static final String KEY_PENG_ALAMAT = "alamat"; //

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id";
    public static final String TAG_NIK = "nik";
    public static final String TAG_NAMA = "nama";
    public static final String TAG_JK = "jenis_kelamin";
    public static final String TAG_ALAMAT = "alamat";

    //ID pengajuan
    //peng itu singkatan dari pengajuan
    public static final String PENG_ID = "peng_id";
}
