import 'package:flutter/foundation.dart';
import 'package:flutter/material.dart';

void main() {
  LicenseRegistry.addLicense(() async* {
    yield LicenseEntryWithLineBreaks(
      ['my_package'],
      'Blah blah.',
    );
  });
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'AboutDialog App',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: MyHomePage(),
    );
  }
}

class MyHomePage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    AboutDialog();

    return Scaffold(
      appBar: AppBar(
        title: Text('AboutDialog Demo'),
      ),
      body: Center(
        child: MyMenu(),
      ),
    );
  }
}

class MyMenu extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Column(
      mainAxisAlignment: MainAxisAlignment.center,
      children: <Widget>[
        MaterialButton(
          onPressed: () => Scaffold.of(context).showSnackBar(SnackBar(
            content: Text('Sorry, not implemented.'),
          )),
          color: Colors.pink,
          textColor: Colors.white,
          child: Text('Reticulate splines'),
        ),
        MaterialButton(
          onPressed: () {
            showAboutDialog(
              context: context,
              applicationVersion: '2.0.1',
              applicationIcon: MyAppIcon(),
              applicationLegalese:
                  'This application has been approved for all audiences.',
              children: [
                Padding(
                  padding: const EdgeInsets.only(top: 20),
                  child: Text('This is where I\'d put more information about '
                      'this app, if there was anything interesting to say.'),
                ),
              ],
            );
          },
          child: Text('More info'),
        ),
      ],
    );
  }
}

class MyAppIcon extends StatelessWidget {
  static const double size = 32;

  @override
  Widget build(BuildContext context) {
    return Center(
      child: Padding(
        padding: const EdgeInsets.symmetric(vertical: 8.0),
        child: SizedBox(
          width: size,
          height: size,
          child: FlutterLogo(),
        ),
      ),
    );
  }
}
