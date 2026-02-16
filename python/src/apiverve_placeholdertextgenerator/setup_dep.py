from setuptools import setup, find_packages

setup(
    name='apiverve_placeholdertextgenerator',
    version='1.1.14',
    packages=find_packages(),
    include_package_data=True,
    install_requires=[
        'requests',
        'setuptools'
    ],
    description='Placeholder Text Generator is a tool for generating placeholder text in various styles including lorem ipsum, tech jargon, hipster, corporate, pirate, fantasy, and sci-fi.',
    author='APIVerve',
    author_email='hello@apiverve.com',
    url='https://apiverve.com/marketplace/placeholdertext?utm_source=pypi&utm_medium=homepage',
    classifiers=[
        'Programming Language :: Python :: 3',
        'Operating System :: OS Independent',
    ],
    python_requires='>=3.6',
)
