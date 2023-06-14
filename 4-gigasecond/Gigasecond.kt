import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond {
    var date: LocalDateTime

    constructor(date: LocalDateTime) {
        this.date = date.plusSeconds(1000000000)
    }

    constructor(date: LocalDate) {
        this.date = date.atStartOfDay().plusSeconds(1000000000)
    }
}
