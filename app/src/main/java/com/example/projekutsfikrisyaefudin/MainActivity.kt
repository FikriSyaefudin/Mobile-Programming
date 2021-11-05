package com.example.projekutsfikrisyaefudin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()


        //Simpan data

        data?.add(DataModel(R.drawable.angklung, "Jawa Barat","Angklung","angklung merupakan salah satu alat musik tradisional dari Jawa Barat yang telah dikenal hingga ke ranah Internasional. Angklung adalah alat musik yang terbuat dari belahan bambu yang dirangkai dan disusun sehingga apabila digoyangkan akan menciptakan nada yang khas." ))

        data?.add(DataModel(R.drawable.aramba,"sumatra Utara","Aramba","Aramba atau Arumba adalah alat musik tradisional yang berasal dari Kabupaten Nias, Sumatera Utara. Alat musik ini dipakai oleh warga setempat dalam acara kesenian daerah, seperti penikahan. Aramba terbuat dari tembaga, kuningan, suasa dan nikel. Alat ini dimainkan oleh satu orang. Alat musik ini juga diyakini mempunyai nilai keramat alias mistis oleh warga Nias."))

        data?.add(DataModel(R.drawable.gamelan,"Jawa Barat","Gamelan","Gamelan adalah perpaduan dari beberapa alat musik tradisional Indonesia yang dimainkan bersamaan, terdiri dari gong, gambang, saron, kenong, dan beberapa alat musik lainnya."))

        data?.add(DataModel(R.drawable.gendang,"Jawa Tengah","Gendang","Gendang merupakan alat musik tradisional yang dimainkan dengan cara dipukul. Alat musik gendang terbuat dari kayu dengan selaput atau membran pada sisinya."))

        data?.add(DataModel(R.drawable.sasando,"NTT","Sasando","Sejak abad ke-7, Sasando telah dipakai di Rote, tepatnya Nusa Tenggara Timur. Alat musik tradisional NTT ini, berupa kawat yang dimainkannya dengan dipetik. Sasando memiliki keunikan, yakni pada bagian utama dengan bentuk tabung panjang dari belahan bambu. Keunikan tersebut mengantarkan sasando menjadi alat musik tradisional Indonesia yang mendapatkan penghargaan dari The United Nations Educational, Scientific and Cultural Organization (UNESCO). "))

        data?.add(DataModel(R.drawable.tifa,"Maluku","Tifa","Alat musik tradisional Tifa berasal dari Maluku dan Papua, bentuknya mirip tabung yang dimainkannya dengan dipukul. Lazimnya, tifa dimainkan saat upacara adat, mengiringi tarian tradisional khas Indonesia, serta pertunjukan musik tradisional. Berdasarkan jenisnya, tifa terbagi menjadi tifa jekir, dasar, bas, dan potong."))





        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("harga", item?.alamat)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}