class Poesd(val name: String, val punO: String,val punN: String,val vr:String,val vput:  Double,val sk:Double){//name-Имя поезда punO-Пункт Отправки punN-Пункт Назначения vr-Время отправления vput-время в пути sk-Скорость поезда
    var vid = ""//Вид поезда
    var rast = ""//Расстояние меежду станциями
    var stol = ""//Посещение столицы
    var p = 0
    fun Pr(){//Проверка данных
        when{
            (vput <= 0 || sk <= 0||name==""||punO==""||punN==""||vr=="")->p = 1;
        }
    }

    fun St(){//Проверка Посещения столицы
        when{
            (p!=1)->when{
                (punO=="Москва")->stol="Вы посетили Столицу"
                (punN=="Москва")->stol="Вы посетите Столицу"
                else->stol="Вы не посетите столицу"
            }

        }
    }

    fun Ps(){//Проверка какой вид поезда
        when {
            (p==1) -> vid = "Неверные данные"
            else -> {
                when {
                    (sk > 91) -> vid ="Ласточка"
                    (sk<50)->vid="Пасажирский"
                    (sk>200)->vid="Неверная скорость"
                    else->vid="Скорый Пасажирский"
                }
            }

        }
    }
    fun Rast(){//Расстояние между станциями
        when {
            (p==1) -> rast = "Неверные данные"
            else-> rast = "Итого километров " + sk * vput
        }
    }

    fun Out(){//Вывод данных
        when{
            (p!=1)-> {
                println("Дополнительные данные о поезде ${name}")
                println(vid)
                println(rast)
                println(stol)
            }
            else->{
                println("Одно из данных неверное")
            }
        }
    }
}