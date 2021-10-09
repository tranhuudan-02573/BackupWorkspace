import 'dart:math';

import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        primarySwatch: Colors.blue,
        visualDensity: VisualDensity.adaptivePlatformDensity,
        textTheme: TextTheme(
            headline2: TextStyle(
              color: Colors.white,
              fontWeight: FontWeight.w900,
              letterSpacing: -2,
            ),
            bodyText2: TextStyle(
              // This is a hack. We actually don't guarantee that the font
              // family will be available. But it does work (at least for me)
              // in DartPad and that's all I care about with this sample.
              fontFamily: 'Times',
              fontSize: 18,
            )),
      ),
      home: MyHomePage(title: 'Flutter Demo Home Page'),
    );
  }
}

class MyHomePage extends StatefulWidget {
  MyHomePage({Key key, this.title}) : super(key: key);

  final String title;

  @override
  _MyHomePageState createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Padding(
        padding: const EdgeInsets.only(top: 80, left: 30, right: 0),
        child: Row(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            _RotatedVersusTransform(
              child: Container(
                color: Colors.black,
                child: Text(
                  ' Rotation ',
                  style: Theme.of(context).textTheme.headline2,
                ),
              ),
            ),
            Expanded(
              child: ListView(
                padding: EdgeInsets.zero,
                children: [
                  _LoremIpsumParagraph(0),
                  _LoremIpsumParagraph(1),
                  _LoremIpsumParagraph(2),
                  _LoremIpsumParagraph(3),
                ],
              ),
            ),
            RotatedBox(
              quarterTurns: 3,
              child: Row(
                children: [
                  SizedBox(width: 30),
                  _Chip('Dash'),
                  _Chip('Flutter'),
                  _Chip('Tutorial'),
                ],
              ),
            ),
          ],
        ),
      ),
    );
  }
}

/// This widget allows switching between [RotatedBox] and [Transform.rotate]
/// by simply tapping the child.
class _RotatedVersusTransform extends StatefulWidget {
  final Widget child;

  const _RotatedVersusTransform({@required this.child, Key key})
      : super(key: key);

  @override
  _RotatedVersusTransformState createState() => _RotatedVersusTransformState();
}

class _RotatedVersusTransformState extends State<_RotatedVersusTransform> {
  bool useRotated = true;

  int turns = 3;

  @override
  Widget build(BuildContext context) {
    Widget box;
    if (useRotated) {
      box = RotatedBox(
        quarterTurns: turns,
        child: widget.child,
      );
    } else {
      box = Transform.rotate(
        angle: turns * pi / 2,
        child: widget.child,
      );
    }

    return InkWell(
      onTap: () => setState(() => useRotated = !useRotated),
      onLongPress: () => setState(() => turns++),
      child: box,
    );
  }
}

class _LoremIpsumParagraph extends StatelessWidget {
  final int index;

  const _LoremIpsumParagraph(this.index);

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsetsDirectional.only(start: 20, bottom: 20),
      child: Text(
        _texts[index % _texts.length],
        textAlign: TextAlign.justify,
      ),
    );
  }

  static const _texts = [
    '''According to Webster’s, rotation is the act of turning, as a wheel or a solid body on its axis, as distinguished from the progressive motion of a revolving round another body or a distant point.''',
    '''Thus, the daily turning of the earth on its axis is a rotation; its annual motion round the sun is a revolution.''',
    'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.',
    'Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?',
  ];
}

class _Chip extends StatelessWidget {
  final String text;

  const _Chip(this.text);

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.symmetric(horizontal: 5, vertical: 10),
      child: Chip(
        label: Text(text),
      ),
    );
  }
}
