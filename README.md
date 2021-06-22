# Split Package Demo

This is a split package demo consisting of four `.jar` files:
1. an explicit module `org.example.explicit`,
2. an automatic module `org.example.automatic`,
3. `split-one` containing classes in package `org.example.split` 
3. `split-two` containing classes in package `org.example.split`

We can show that the application is able to access classes from `split-one` as well as `split-two`
if both remain on the classpath (`-cp`).

However, if these two jars end up as the unnamed module on the module path (`-p`), the app fails to
launch due to both sharing the same package.

## Usage

```
# compile 🛠
mvn clean package

# put split packages on classpath ✅
(cd target/example && java -p mods -cp libs/split-one-1.0.0.jar:libs/split-two-1.0.0.jar -m org.example.explicit/org.example.explicit.Main)

# put split packages on module path ❌
(cd target/example && java -p mods:libs -m org.example.explicit/org.example.explicit.Main)
```