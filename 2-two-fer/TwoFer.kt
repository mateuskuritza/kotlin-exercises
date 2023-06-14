fun twofer(name: String?): String {
    if(name.isNullOrEmpty()) {
        return "One for you, one for me."
    } else {
        return "One for $name, one for me."
    }
}
