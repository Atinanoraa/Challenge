import java.util.*
import kotlin.system.exitProcess
fun main() {
    val input = Scanner(System.`in`)
    print("Nama : ")
    val nama: String? = input.nextLine()
    if(nama.isNullOrEmpty()){
        main()
    }
    print("Absen: ")
    val absen: Int? = input.nextInt()
    print("Kelas : ")
    readLine()
    val kelas: String? =null
    val a = kelas?.length?:"XI RPL1"
    println("""
        
        ========== KALKULATOR BANGUN RUANG ==========
        Silahkan Pilih Bangun Ruang 
        1. Kerucut
        2. Tabung
    """.trimIndent())
    print("Pilih bangun ruang : ")
    var pilih:Int? = input.nextInt()
    when (pilih){
        1 -> Kerucut()
        2 -> Tabung()
        else -> println("Undefined")
    }
    print("Apakah anda mau lanjut? [y/n] : ")
    val lanjut = readLine()
    if (lanjut=="Y" || lanjut=="y"){
        main()
    }else {
        println("~~~~~~~~~~~~~~~~~~~~~~~~~~~ EXIT ~~~~~~~~~~~~~~~~~~~~~~~~~~~")
        exitProcess(1)}
    println("==========================================")
}
fun Kerucut() {
    println("\n--------------- Perhitungan Volume Kerucut ---------------")
    print("Masukkan Jari-jari : ")
    val r = readLine()!!.toInt()
    print("Masukkan Tinggi Kerucut : ")
    val t = readLine()!!.toInt()
    print("Volume Tabung adalah = ")
    System.out.printf("%.2f %n", Math.PI * r * r * t /3)
}
fun Tabung() {
    println("\n--------------- Perhitungan Volume Tabung ---------------")
    print("Masukkan Jari-jari : ")
    val r = readLine()!!.toInt()
    print("Masukkan Tinggi Tabung : ")
    val t = readLine()!!.toInt()
    print("Volume Tabung adalah = ")
    System.out.printf("%.2f %n", Math.PI * r * r * t)
}

