# Capicon

## Installation

```
repositories {
    maven { url 'https://raw.githubusercontent.com/tnantoka/Capicon/master/repository/' }
}

dependencies {
    compile 'com.bornneet.capicon:capicon:1.0.4'
}
```

## Usage

```
Capicon capicon = new Capicon(300);

capicon.backgroundColor = Capicon.Colors.PINK;
capicon.string = "C";
capicon.textScale = 0.7;
capicon.roundScale = 0.1f;

Bitmap bitmap = capicon.bitmap();
```

## Demo

https://github.com/tnantoka/itoa/tree/master/CapiconDemo

## Development

```
$ ./gradlew assembleRelease
$ ./gradlew uploadArchives
```
