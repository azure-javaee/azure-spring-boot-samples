## Verify

1. can change spring profile

## Problems

1. cannot resolve placeholder in application.yml
2. already support this dependency, but need to double confirm if support multi-binder scenario
3. maybe @PostMapping + @RequestParam will meet the error:
   ```
   Name for argument of type [java.lang.String] not specified, and parameter name information not available via reflection. Ensure that the compiler uses the '-parameters' flag.
   ```