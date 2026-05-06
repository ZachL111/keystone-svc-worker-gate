fun main() {
    val signalcase_1 = Signal(63, 79, 9, 8, 7)
    check(Policy.score(signalcase_1) == 165)
    check(Policy.classify(signalcase_1) == "review")
    val signalcase_2 = Signal(68, 74, 23, 20, 4)
    check(Policy.score(signalcase_2) == 41)
    check(Policy.classify(signalcase_2) == "review")
    val signalcase_3 = Signal(93, 96, 16, 12, 4)
    check(Policy.score(signalcase_3) == 182)
    check(Policy.classify(signalcase_3) == "accept")
    val domainReview = DomainReview(65, 48, 28, 64)
    check(DomainReviewLens.score(domainReview) == 158)
    check(DomainReviewLens.lane(domainReview) == "ship")
}
