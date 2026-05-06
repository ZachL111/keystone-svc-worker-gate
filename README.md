# keystone-svc-worker-gate

`keystone-svc-worker-gate` is a Kotlin project in backend services. Its focus is to design a Kotlin verification harness for worker systems, covering protocol validation, framed sample traffic, and failure-oriented tests.

## Use Case

The project exists to keep a narrow engineering decision visible and testable. For this repo, that decision is how queue pressure and worker slack should influence a review result.

## Keystone Svc Worker Gate Review Notes

Start with `session drift` and `retry load`. Those cases create the widest score spread in this repo, so they are the best quick check when the model changes.

## Highlights

- `fixtures/domain_review.csv` adds cases for queue pressure and retry load.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/keystone-svc-worker-walkthrough.md` walks through the case spread.
- The Kotlin code includes a review path for `session drift` and `retry load`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Code Layout

The implementation keeps the scoring rule plain: reward signal and confidence, preserve slack, penalize drag, then classify the result into a review lane.

The added Kotlin path is deliberately direct, with fixtures doing most of the explaining.

## Run The Check

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Regression Path

The verifier is intentionally local. It should fail if the fixture score math, lane assignment, or language-specific test drifts.

## Future Work

The repository is intentionally scoped to local checks. I would expand it by adding adversarial fixtures before adding features.
