# Field Notes

`keystone-svc-worker-gate` is easiest to review by starting with the fixture, not the prose.

The domain cases cover `queue pressure`, `retry load`, `worker slack`, and `session drift`. They sit beside the smaller starter fixture so the project has both a compact scoring check and a domain-flavored review check.

The model rewards signal and confidence, then pulls back for drag. In this fixture, `stress` shows where that pullback matters most.

The language-specific addition keeps the review model in a JVM-friendly data class.
