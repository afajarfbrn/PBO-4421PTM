fun main(args: Array<String>) {

    val jumlah : Long = 3660

    val jam = jumlah / 3600
    val menit = jumlah % 3600 / 60
    val detik = jumlah % 3600

    println("$jam : $menit : $detik")
}