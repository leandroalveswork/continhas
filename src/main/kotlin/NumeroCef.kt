import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.pow
import kotlin.math.roundToInt

class NumeroCef(private var _numero: Double) {
    val numero: Double
        get() {
            return _numero
        }
    fun arredondarCasas(qtdeCasas: Int) {
        val mutpAntesArred = 10.0.pow(qtdeCasas)
        var numeroArreded = _numero * mutpAntesArred
        val idxVirgula = numeroArreded.toString().indexOfFirst { it == '.' }
        val digitoAposVirgula = numeroArreded.toString()[idxVirgula + 1].digitToInt()
        if (digitoAposVirgula <= 4) {
            numeroArreded = floor(numeroArreded)
            _numero = numeroArreded / mutpAntesArred
            return
        }
        if (digitoAposVirgula >= 6) {
            numeroArreded = ceil(numeroArreded)
            _numero = numeroArreded / mutpAntesArred
            return
        }
        val numeroArrededTrimZeros = trimZerosDireitaAposVirgula(numeroArreded.toString())
        if (numeroArrededTrimZeros.length - 1 > idxVirgula + 1) {
            numeroArreded = ceil(numeroArreded)
            _numero = numeroArreded / mutpAntesArred
            return
        }
        val digitoAntesVirgula = numeroArreded.toString()[idxVirgula - 1].digitToInt()
        if (digitoAntesVirgula % 2 == 0) {
            numeroArreded = floor(numeroArreded)
            _numero = numeroArreded / mutpAntesArred
            return
        }
        numeroArreded = ceil(numeroArreded)
        _numero = numeroArreded / mutpAntesArred
    }

    fun trimZerosDireitaAposVirgula(numeroComZeros: String): String {
        val idxVirgula = numeroComZeros.indexOfFirst { it == '.' }
        if (idxVirgula == -1) {
            return numeroComZeros
        }
        val partInteira = numeroComZeros.substring(0, idxVirgula)
        val idxUltimoDigitoAposVirgula = numeroComZeros.indexOfLast { it != '0' }
        if (idxUltimoDigitoAposVirgula == -1) {
            return numeroComZeros
        }
        val partDecimal = numeroComZeros.substring(idxVirgula + 1, idxUltimoDigitoAposVirgula)
        return partInteira + "." + partDecimal
    }
}